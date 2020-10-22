package messageq.config;

import com.messageq.config.ExchangeCreationResponse;
import lombok.experimental.UtilityClass;

@UtilityClass
public class MessageQueueResponseFactory {

    public com.messageq.config.ExchangeCreationResponse toExchangeCreationResponse(
            String exchangeName, boolean created,
            String errorMessage) {

        return ExchangeCreationResponse
                .newBuilder()
                .setExchangeName(exchangeName)
                .setCreated(created)
                .setErrorMessage(errorMessage)
                .build();
    }

    public com.messageq.config.CreatePlayerQueueResponse toCreatePlayerQueueResponse(
            String exchangeName, String queueName, int playerId,
            boolean created, String errorMessage) {

        return com.messageq.config.CreatePlayerQueueResponse
                .newBuilder()
                .setExchangeName(exchangeName)
                .setQueueName(queueName)
                .setPlayerId(playerId)
                .setCreated(created)
                .setErrorMessage(errorMessage)
                .build();
    }

}
