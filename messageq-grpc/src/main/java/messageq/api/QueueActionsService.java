package messageq.api;

import com.google.protobuf.Timestamp;
import com.messageq.api.actions.PopMessageRequest;
import com.messageq.api.actions.PushMessageConfirmationResponse;
import com.messageq.api.actions.PushMessageRequest;
import com.messageq.api.actions.QueueActionsGrpcServiceGrpc;
import com.messageq.api.actions.QueueMessage;
import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.amqp.AmqpException;
import org.springframework.amqp.rabbit.core.RabbitTemplate;

@RequiredArgsConstructor
@GrpcService
public class QueueActionsService
        extends QueueActionsGrpcServiceGrpc.QueueActionsGrpcServiceImplBase {

    private final RabbitTemplate rabbitTemplate;

    @Override
    public void pushMessage(
            PushMessageRequest request,
            StreamObserver<PushMessageConfirmationResponse> responseObserver) {
        QueueMessage message = request.getMessage();

        try {
            rabbitTemplate.convertAndSend(
                    request.getExchangeName(), request.getRoutingKey(), message);
        } catch (AmqpException e) {
            responseObserver.onError(e);
        }

        responseObserver.onNext(
                PushMessageConfirmationResponse.newBuilder()
                        .setType(message.getType())
                        .setTimestamp(Timestamp.newBuilder().build())
                        .build());
        responseObserver.onCompleted();
    }

    @Override
    public void popMessage(
            PopMessageRequest request, StreamObserver<QueueMessage> responseObserver) {
        QueueMessage message =
                (QueueMessage) rabbitTemplate.receiveAndConvert(request.getQueueName());

        try {
            responseObserver.onNext(message);
        } catch (AmqpException e) {
            responseObserver.onError(e);
        }

        responseObserver.onCompleted();
    }
}
