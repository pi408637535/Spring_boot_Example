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
public class ReceiverServiceFoo {
    @RabbitListener(queues = "queue.foo", containerFactory="rabbitListenerContainerFactory")
    public void receiveFooQueue(@Payload Foo foo) {
        System.out.println(TimeUtils.getTime() + " Received ---1--- Foo<" + foo.getName() + ">");
    }

    @RabbitListener(queues = "queue.foo", containerFactory="rabbitListenerContainerFactory")
    public void receiveFoo2Queue(@Payload Foo foo) {
        System.out.println(TimeUtils.getTime() + " Received ---2--- Foo<" + foo.getName() + ">");
    }

    @RabbitListener(queues = "queue.foo", containerFactory="rabbitListenerContainerFactory")
    public void receiveFoo3Queue(@Payload Foo foo) {
        System.out.println(TimeUtils.getTime() + " Received ---3--- Foo<" + foo.getName() + ">");
    }
}
