package com.patterncat.receiver;

import com.patterncat.model.Bar;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by piguanghua on 2016/12/23.
 */
@Component
public class ReceiverServiceBar {
    @RabbitListener(queues = "queue.bar", containerFactory="rabbitListenerContainerFactory")
    public void receiveBarQueue(@Payload Bar bar) {
        Date dt=new Date();
        SimpleDateFormat matter1=new SimpleDateFormat("yyyy-MM-dd");
        System.out.println( matter1.format(dt) + " Received Bar<" + bar.getAge() + ">" );
    }


}
