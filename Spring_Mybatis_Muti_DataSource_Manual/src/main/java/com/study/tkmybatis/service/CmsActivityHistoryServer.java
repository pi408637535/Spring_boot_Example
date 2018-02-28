package com.study.tkmybatis.service;

import com.study.tkmybatis.dao.FavorStockDao;
import com.study.tkmybatis.dao.PayOrderDao;
import com.study.tkmybatis.model.FavorStock;
import com.study.tkmybatis.model.PayOrder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by piguanghua on 1/18/18.
 */
@Service
public class CmsActivityHistoryServer {

    @Resource
    PayOrderDao payOrderDao;

    public void test(){
     //   cmsActivityHistoryDao.count();
        List<PayOrder> payOrders = payOrderDao.getListEntity(new PayOrder());
       /* List<FavorStock> favorStockList = favorStockDao.getListEntity(new FavorStock());
        FavorStock ele =  favorStockList.get(0);
        favorStockDao.count();*/
        payOrderDao.count();
    }
}
