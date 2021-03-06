import inspect.version.UserSecurityInterceptor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;

/**
 * Created by piguanghua on 2016/10/16.
 * 访问的URL：localhost:8080/
 */
@SpringBootApplication
@ComponentScan({"inspect"})
public class Application {
    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }

    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new UserSecurityInterceptor()).addPathPatterns("/*");
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }
}
