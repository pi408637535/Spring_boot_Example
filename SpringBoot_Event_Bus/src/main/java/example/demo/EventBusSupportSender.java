package example.demo;

/**
 * Created by piguanghua on 6/1/18.
 */
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;

import org.zalando.stups.boot.eventbus.EventBusSupport;

@Component
public class EventBusSupportSender {

    private final EventBusSupport eventBusSupport;

    @Autowired
    public EventBusSupportSender(final EventBusSupport eventBusSupport) {
        this.eventBusSupport = eventBusSupport;
    }

    public void sendEvents() {
        this.eventBusSupport.post(new SimpleEvent());
        this.eventBusSupport.postAsync(new SimpleEvent());
    }

}
