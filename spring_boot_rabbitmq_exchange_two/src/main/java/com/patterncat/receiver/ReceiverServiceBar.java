package com.patterncat.receiver;

import com.patterncat.model.Bar;
import com.patterncat.model.Foo;
import com.patterncat.utils.TimeUtils;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

/**
 * Created by piguanghua on 2016/12/23.
 */
@Component
public class ReceiverServiceBar {
    @RabbitListener(queues = "queue.bar", containerFactory="rabbitListenerContainerFactory")
    public void receiveBarQueue(@Payload Bar bar) {
        System.out.println(TimeUtils.getTime() + " Received Foo<" + bar.getAge() + ">");
    }
}
