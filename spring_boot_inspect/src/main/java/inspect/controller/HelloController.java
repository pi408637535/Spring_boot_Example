package inspect.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wode3 on 2016/12/13.
 */
@RestController
@RequestMapping("/hello")
public class HelloController {
    @RequestMapping("/index")
    public void save() {
        System.out.println("hello");
    }
}
