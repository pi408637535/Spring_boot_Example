package com.controller;

import com.config.MyConfig;
import com.config.MyWebServerConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wode3 on 2016/11/28.
 */
@RestController("/wo")
public class HelloController {
    @Autowired
    private MyConfig myConfig;

    @Autowired
    private MyWebServerConfiguration myWebServerConfiguration;

    @RequestMapping("/config")
    public Object getConfig() {
        return myConfig.getServers();
    }

    @RequestMapping("/test")
    public  Object getConfigTest(){
        myWebServerConfiguration.getConfig();
        return null;
    }
}
