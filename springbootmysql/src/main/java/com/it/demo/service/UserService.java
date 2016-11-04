package com.it.demo.service;

import com.github.pagehelper.PageHelper;
import com.it.demo.bean.User;
import com.it.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by piguanghua on 2016/10/16.
 */
@Service
public class UserService {
    @Autowired
    private UserMapper demoMappper;

    public List<User> likeName(String name){
        PageHelper.startPage(1,1);
        return demoMappper.likeName(name);
    }
}
