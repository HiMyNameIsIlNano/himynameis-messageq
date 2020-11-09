package messageq.create;

import com.messageq.api.creation.CreatePlayerQueueResponse;
import com.messageq.api.creation.ExchangeCreationResponse;
import lombok.experimental.UtilityClass;

@UtilityClass
public class MessageQueueResponseFactory {

    public ExchangeCreationResponse toExchangeCreationResponse(
            String exchangeName, boolean created,
            String errorMessage) {

        return ExchangeCreationResponse
                .newBuilder()
                .setExchangeName(exchangeName)
                .setCreated(created)
                .setErrorMessage(errorMessage)
                .build();
    }

    public CreatePlayerQueueResponse toCreatePlayerQueueResponse(
            String exchangeName, String routingKey, String queueName, int playerId,
            boolean created, String errorMessage) {

        return CreatePlayerQueueResponse
                .newBuilder()
                .setExchangeName(exchangeName)
                .setQueueName(queueName)
                .setPlayerId(playerId)
                .setCreated(created)
                .setRoutingKey(routingKey)
                .setErrorMessage(errorMessage)
                .build();
    }

}
