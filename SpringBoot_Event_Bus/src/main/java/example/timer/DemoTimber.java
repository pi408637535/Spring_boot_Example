package example.timer;

import example.demo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by piguanghua on 6/1/18.
 */
@Component
@Configurable
@EnableScheduling
public class DemoTimber {

    @Autowired
    private MultiEventBusSender multiEventBusSender;

    @Autowired
    private SimpleEventSender simpleEventSender;

    @Autowired
    private EventBusSupportSender eventBusSupportSender;

    @Autowired
    private SimpleAsyncEventSender simpleAsyncEventSender;

    @Autowired
    private SimpleSubscriber subscriber;

    @Autowired
    private LoggingDeadEventListener deadEventListener;

    @Autowired
    private AbstractApplicationContext aac;

    @Scheduled(cron = "0/1 * *  * * * ")
    public void reportCurrentByCron(){
       // this.multiEventBusSender.sendEvents();
       // this.simpleEventSender.sendEvents();
      //  this.simpleAsyncEventSender.sendEvents();
        this.eventBusSupportSender.sendEvents();
    }
}
