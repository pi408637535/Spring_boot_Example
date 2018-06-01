package example.demo;

import com.google.common.eventbus.Subscribe;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by piguanghua on 6/1/18.
 */
@Component
public class SimpleSubscriber2 {

    private Logger log = LoggerFactory.getLogger(SimpleSubscriber.class);


    @Subscribe
    public void handle(final SimpleEvent event) {
        log.info("Handle Event2 : {}", event.toString());
    }

}
