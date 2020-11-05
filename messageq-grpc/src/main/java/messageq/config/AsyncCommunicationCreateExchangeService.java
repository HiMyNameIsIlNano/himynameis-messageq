package messageq.config;

import com.messageq.config.CreatePlayerQueueResponse;
import com.messageq.config.ManageQueueGrpcServiceGrpc.ManageQueueGrpcServiceImplBase;
import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.amqp.AmqpException;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.Binding.DestinationType;
import org.springframework.amqp.core.Exchange;
import org.springframework.amqp.core.ExchangeBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.QueueBuilder;
import org.springframework.amqp.rabbit.core.RabbitAdmin;

@RequiredArgsConstructor
@GrpcService
public class AsyncCommunicationCreateExchangeService extends ManageQueueGrpcServiceImplBase {

    private final RabbitAdmin rabbitAdmin;

    @Override
    public void createExchange(com.messageq.config.ExchangeCreationRequest request,
            StreamObserver<com.messageq.config.ExchangeCreationResponse> responseObserver) {
        boolean created = true;
        String errorMessage = "";

        try {
            declareExchange(request.getExchangeName());
        } catch (AmqpException e) {
            created = false;
            errorMessage = e.getMessage();
        }

        responseObserver.onNext(MessageQueueResponseFactory
                .toExchangeCreationResponse(request.getExchangeName(), created, errorMessage));

        responseObserver.onCompleted();
    }

    private void declareExchange(String exchangeName) {
        Exchange exchange = ExchangeBuilder
                .directExchange(exchangeName)
                .build();

        rabbitAdmin.declareExchange(exchange);
    }

    @Override
    public void connectPlayerToQueue(com.messageq.config.CreatePlayerQueueRequest request,
            StreamObserver<com.messageq.config.CreatePlayerQueueResponse> responseObserver) {
        boolean created = true;
        String errorMessage = "";

        String exchangeName = request.getExchangeName();
        String queueName = request.getQueueName();

        try {
            declareExchange(exchangeName);
            declareQueueAndBindToExchange(request.getRoutingKey(), queueName, exchangeName);
        } catch (AmqpException e) {
            created = false;
            errorMessage = e.getMessage();
        }

        CreatePlayerQueueResponse playerQueueResponse = MessageQueueResponseFactory
                .toCreatePlayerQueueResponse(exchangeName, queueName,
                        request.getPlayerId(), created, errorMessage);

        responseObserver.onNext(playerQueueResponse);
        responseObserver.onCompleted();
    }

    private void declareQueueAndBindToExchange(String routingKey, String queueName, String exchangeName) {
        Queue nonDurableQueue = QueueBuilder
                .nonDurable(queueName)
                .build();
        rabbitAdmin.declareQueue(nonDurableQueue);

        Binding binding = new Binding(queueName, DestinationType.QUEUE,
                exchangeName, routingKey, null);
        rabbitAdmin.declareBinding(binding);
    }
}
