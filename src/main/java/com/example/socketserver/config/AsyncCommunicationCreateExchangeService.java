package com.example.socketserver.config;

import javax.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.core.ExchangeBuilder;
import org.springframework.amqp.rabbit.core.RabbitAdmin;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class AsyncCommunicationCreateExchangeService {

    private final RabbitAdmin rabbitAdmin;

    @Value("socket.push.exchange-name:default-push-notification")
    public static String PUSH_NOTIFICATION_EXCHANGE;

    @PostConstruct
    private void createExchanges() {
        rabbitAdmin.declareExchange(
                ExchangeBuilder.directExchange(PUSH_NOTIFICATION_EXCHANGE).build());
    }
}
