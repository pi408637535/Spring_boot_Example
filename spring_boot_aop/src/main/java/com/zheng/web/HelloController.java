package com.zheng.web;

import com.zheng.model.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhenglian on 2016/10/7.
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello() {
        return "hello world";
    }

    @RequestMapping(value = "/postHello",method = RequestMethod.POST)
    public String postHello(@RequestBody User user) {
        System.out.println(user.getUsername());
        return "hello world";
    }

}
