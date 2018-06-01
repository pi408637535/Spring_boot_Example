package example.demo;

/**
 * Created by piguanghua on 6/1/18.
 */
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;

import com.google.common.eventbus.AsyncEventBus;
import com.google.common.eventbus.EventBus;

@Component
public class MultiEventBusSender {

    private final AsyncEventBus asyncEventBus;

    private final EventBus eventBus;

    @Autowired
    public MultiEventBusSender(final AsyncEventBus asyncEventBus, final EventBus eventBus) {
        this.asyncEventBus = asyncEventBus;
        this.eventBus = eventBus;
    }

    public void sendEvents() {
        this.asyncEventBus.post(new SimpleEvent());
        this.eventBus.post(new SimpleEvent());
    }
}
