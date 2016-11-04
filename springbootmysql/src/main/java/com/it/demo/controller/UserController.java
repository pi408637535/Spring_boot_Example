package com.it.demo.controller;

import com.it.demo.bean.User;
import com.it.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by piguanghua on 2016/10/16.
 */
@RestController
public class UserController {
    @Autowired
    private UserService demoService;

    @RequestMapping("/likeName")
    public List<User> likeName(String name){
        return demoService.likeName(name);
    }
}
