package messageq.config;

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
            Exchange exchange = ExchangeBuilder
                    .directExchange(request.getExchangeName())
                    .build();
            rabbitAdmin.declareExchange(exchange);
        } catch (AmqpException e) {
            created = false;
            errorMessage = e.getMessage();
        }

        responseObserver.onNext(MessageQueueResponseFactory
                .toExchangeCreationResponse(request.getExchangeName(), created, errorMessage));

        responseObserver.onCompleted();
    }

    @Override
    public void connectPlayerToQueue(com.messageq.config.CreatePlayerQueueRequest request,
            StreamObserver<com.messageq.config.CreatePlayerQueueResponse> responseObserver) {
        boolean created = true;
        String errorMessage = "";

        String queueName = request.getQueueName();
        try {
            Queue nonDurableQueue = QueueBuilder
                    .nonDurable(queueName)
                    .build();
            rabbitAdmin.declareQueue(nonDurableQueue);

            Binding binding = new Binding(queueName, DestinationType.QUEUE,
                    request.getExchangeName(), "", null);
            rabbitAdmin.declareBinding(binding);
        } catch (AmqpException e) {
            created = false;
            errorMessage = e.getMessage();
        }

        responseObserver.onNext(MessageQueueResponseFactory
                .toCreatePlayerQueueResponse(request.getExchangeName(), queueName,
                        request.getPlayerId(), created, errorMessage));

        responseObserver.onCompleted();
    }
}
