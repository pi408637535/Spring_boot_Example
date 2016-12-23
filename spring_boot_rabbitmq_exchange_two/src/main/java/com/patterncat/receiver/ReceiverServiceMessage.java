package com.patterncat.receiver;

import com.patterncat.model.Foo;
import com.patterncat.model.Message;
import com.patterncat.utils.TimeUtils;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

/**
 * Created by piguanghua on 2016/12/23.
 */
@Component
public class ReceiverServiceMessage {
    @RabbitListener(queues = "queue.message", containerFactory="rabbitListenerContainerFactory")
    public void receiveFooQueue(@Payload Message message) {
        System.out.println(TimeUtils.getTime() + " Received Foo<" + message + ">");
    }
}
