package messageq.create;

import com.messageq.api.creation.*;
import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.amqp.AmqpException;
import org.springframework.amqp.core.*;
import org.springframework.amqp.core.Binding.DestinationType;
import org.springframework.amqp.rabbit.core.RabbitAdmin;

@RequiredArgsConstructor
@GrpcService
public class CreateExchangeService
        extends ManageQueueGrpcServiceGrpc.ManageQueueGrpcServiceImplBase {

    private final RabbitAdmin rabbitAdmin;

    @Override
    public void createExchange(
            ExchangeCreationRequest request,
            StreamObserver<ExchangeCreationResponse> responseObserver) {
        String exchangeName = request.getExchangeName();

        try {
            declareExchange(exchangeName);
        } catch (AmqpException e) {
            responseObserver.onError(e);
        }

        responseObserver.onNext(
                MessageQueueResponseFactory.toExchangeCreationResponse(exchangeName));
        responseObserver.onCompleted();
    }

    private void declareExchange(String exchangeName) {
        Exchange exchange = ExchangeBuilder.directExchange(exchangeName).build();

        rabbitAdmin.declareExchange(exchange);
    }

    @Override
    public void connectPlayerToQueue(
            CreatePlayerQueueRequest request,
            StreamObserver<CreatePlayerQueueResponse> responseObserver) {
        String exchangeName = request.getExchangeName();
        String queueName = request.getQueueName();

        try {
            declareExchange(exchangeName);
            declareQueueAndBindToExchange(request.getRoutingKey(), queueName, exchangeName);
        } catch (AmqpException e) {
            responseObserver.onError(e);
        }

        CreatePlayerQueueResponse playerQueueResponse =
                MessageQueueResponseFactory.toCreatePlayerQueueResponse(
                        exchangeName, request.getRoutingKey(), queueName, request.getPlayerId());

        responseObserver.onNext(playerQueueResponse);
        responseObserver.onCompleted();
    }

    private void declareQueueAndBindToExchange(
            String routingKey, String queueName, String exchangeName) {
        Queue nonDurableQueue = QueueBuilder.nonDurable(queueName).build();
        rabbitAdmin.declareQueue(nonDurableQueue);

        Binding binding =
                new Binding(queueName, DestinationType.QUEUE, exchangeName, routingKey, null);
        rabbitAdmin.declareBinding(binding);
    }
}
