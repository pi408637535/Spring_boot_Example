package br.com.andersonkxiass;

import br.com.andersonkxiass.model.Message;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

/**
 * Created by piguanghua on 2016/12/22.
 */
@Service
@EnableRabbit
public class Receiver {
    @RabbitListener(queues = "queue.message")
    public void receiveMessage( String message) {
        System.out.println("Received Foo<" + message + ">");
    }
}
