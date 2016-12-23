package com.patterncat.sender;

import com.patterncat.model.Bar;
import com.patterncat.model.Foo;
import org.springframework.amqp.rabbit.core.RabbitMessagingTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by patterncat on 2016-02-02.
 */
@Component
@EnableScheduling
public class SenderService {

    @Autowired
    private RabbitMessagingTemplate rabbitMessagingTemplate;

    @Scheduled(fixedRate = 1000)
    public void sendFoo2Rabbitmq() {
        this.rabbitMessagingTemplate.convertAndSend("exchange", "queue.foo", new Foo("foo"));
    }

    @Scheduled(fixedRate = 6000)
    public void sendBar2Rabbitmq(){
        this.rabbitMessagingTemplate.convertAndSend("exchange", "queue.bar", new Bar(1));
    }
}
