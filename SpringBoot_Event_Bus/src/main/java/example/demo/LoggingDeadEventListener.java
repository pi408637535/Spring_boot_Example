package example.demo;

/**
 * Created by piguanghua on 6/1/18.
 */
import java.util.concurrent.CountDownLatch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Component;

import com.google.common.eventbus.DeadEvent;
import com.google.common.eventbus.Subscribe;

/**
 * This listener brings dead events (events where no listener was found) to the console.
 *
 * @author  Joerg Bellmann
 */
@Component
public class LoggingDeadEventListener {

    private static final Logger LOG = LoggerFactory.getLogger(LoggingDeadEventListener.class);
    private CountDownLatch latch = new CountDownLatch(1);

    @Subscribe
    public void handleDeadEvent(final DeadEvent deadEvent) {
        LOG.warn("Ooops, no listener found for this event: {}", deadEvent.getEvent());
        latch.countDown();
    }

    public CountDownLatch getLatch() {
        return latch;
    }

}
