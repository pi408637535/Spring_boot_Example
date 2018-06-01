package example.demo;

/**
 * Created by piguanghua on 6/1/18.
 */
import java.util.concurrent.CountDownLatch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Component;

import com.google.common.eventbus.Subscribe;

/**
 * @author  jbellmann
 */
@Component
public class SimpleSubscriber {

    private Logger log = LoggerFactory.getLogger(SimpleSubscriber.class);

    CountDownLatch latch = new CountDownLatch(6);

    @Subscribe
    public void handle(final SimpleEvent event) {
        log.info("Handle Event : {}", event.toString());
        latch.countDown();
    }

    @Subscribe
    public void handle(final NoOneSubscribedEvent event) {
        log.info("Handle Event : {}", event.toString());
        latch.countDown();
    }

    public CountDownLatch getLatch() {
        return this.latch;
    }

}
