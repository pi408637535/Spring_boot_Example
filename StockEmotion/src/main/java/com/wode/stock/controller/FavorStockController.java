package com.wode.stock.controller;

import com.wode.stock.bean.Result;
import com.wode.stock.service.FavorStockServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;

/**
 * 自选股
 * @author wanghongda @date 2018年1月18日
 */
@RestController
@RequestMapping("/stock/api")
public class FavorStockController {

    @Resource
    FavorStockServer favorStockServer;

    @RequestMapping("/stockData/getFavorStock")
    public Result test(){
    	return new Result(200, favorStockServer.getFavorStock(), new Date().getTime());
    }
}
