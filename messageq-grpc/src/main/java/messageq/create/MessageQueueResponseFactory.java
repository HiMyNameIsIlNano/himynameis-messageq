package messageq.create;

import com.messageq.api.creation.CreatePlayerQueueResponse;
import com.messageq.api.creation.ExchangeCreationResponse;
import lombok.experimental.UtilityClass;

@UtilityClass
public class MessageQueueResponseFactory {

    public ExchangeCreationResponse toExchangeCreationResponse(String exchangeName) {
        return ExchangeCreationResponse.newBuilder().setExchangeName(exchangeName).build();
    }

    public CreatePlayerQueueResponse toCreatePlayerQueueResponse(
            String exchangeName, String routingKey, String queueName, int playerId) {

        return CreatePlayerQueueResponse.newBuilder()
                .setExchangeName(exchangeName)
                .setQueueName(queueName)
                .setPlayerId(playerId)
                .setRoutingKey(routingKey)
                .build();
    }
}
