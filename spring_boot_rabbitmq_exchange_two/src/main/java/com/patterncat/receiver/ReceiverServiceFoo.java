package com.patterncat.receiver;

import com.patterncat.model.Bar;
import com.patterncat.model.Foo;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by patterncat on 2016-02-02.
 */
@Component
public class ReceiverServiceFoo {

    @RabbitListener(queues = "queue.foo", containerFactory="rabbitListenerContainerFactory")
    public void receiveFooQueue(@Payload Foo foo) {
        System.out.println(this.gainTime() + " Received Foo<" + foo.getName() + ">");
    }


    @RabbitListener(queues = "queue.foo", containerFactory="rabbitListenerContainerFactory")
    public void receiveFooQueue2(@Payload Foo foo) {
        System.out.println(this.gainTime() +  " Received Foo 22222222<" + foo.getName() + ">22222222");
    }

    private String gainTime(){
        Date dt=new Date();
        SimpleDateFormat matter1=new SimpleDateFormat("yyyy-MM-dd HH:mm");
       return ""+ matter1.format(dt);
    }
}
