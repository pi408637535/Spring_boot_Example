package com.study.tkmybatis.controller;

import com.study.tkmybatis.service.CmsActivityHistoryServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by piguanghua on 1/18/18.
 */
@RestController
@RequestMapping("/social")
public class CmsActivityHistoryController {

    @Resource
    CmsActivityHistoryServer cmsActivityHistoryServer;

    @RequestMapping("/test")
    public String test(){
        cmsActivityHistoryServer.test();
        return "fsdfds";
    }
}
