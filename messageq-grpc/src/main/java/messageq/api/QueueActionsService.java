package messageq.api;

import com.google.protobuf.Timestamp;
import com.messageq.api.actions.*;
import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.amqp.rabbit.core.RabbitTemplate;

@RequiredArgsConstructor
@GrpcService
public class QueueActionsService extends QueueActionsGrpcServiceGrpc.QueueActionsGrpcServiceImplBase {

    private final RabbitTemplate rabbitTemplate;

    @Override
    public void pushMessage(PushMessageRequest request, StreamObserver<PushMessageConfirmationResponse> responseObserver) {
        QueueMessage message = request.getMessage();
        rabbitTemplate.convertAndSend(request.getExchangeName(), request.getRoutingKey(), message);

        responseObserver.onNext(PushMessageConfirmationResponse.newBuilder()
                .setType(message.getType())
                .setTimestamp(Timestamp.newBuilder().build())
                .build());
        responseObserver.onCompleted();
    }

    @Override
    public void popMessage(PopMessageRequest request, StreamObserver<QueueMessage> responseObserver) {
        QueueMessage message = (QueueMessage) rabbitTemplate.receiveAndConvert(request.getQueueName());

        responseObserver.onNext(message);
        responseObserver.onCompleted();
    }
}

