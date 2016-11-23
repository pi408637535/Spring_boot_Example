package co.paan;

import co.paan.configuration.ElasticsearchConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by hungnguyen on 12/28/14.
 */
@Configuration
@ComponentScan(basePackages = "co.paan")
@EnableAutoConfiguration(exclude = {ElasticsearchConfiguration.class})
public class Application {
    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }


    public static void main(String args[]){
        SpringApplication.run(Application.class);
    }
}
