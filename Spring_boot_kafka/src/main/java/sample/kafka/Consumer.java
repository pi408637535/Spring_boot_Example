package sample.kafka;

/**
 * Created by piguanghua on 5/29/18.
 */
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
class Consumer {

    @KafkaListener(topics = "testTopic")
    public void processMessage(String message) {
        System.out.println("Received sample message [" + message + "]");
    }

}
