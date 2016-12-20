import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by piguanghua on 2016/12/17.
 */
@SpringBootApplication
@ComponentScan({"com.lance.quartz"})
public class ApplicationQuartz {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationQuartz.class, args);
    }
}
