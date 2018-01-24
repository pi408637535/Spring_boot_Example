package com.study.tkmybatis.service;

import com.study.tkmybatis.dao.CmsActivityHistoryDao;
import com.study.tkmybatis.dao.FavorStockDao;
import com.study.tkmybatis.model.FavorStock;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by piguanghua on 1/18/18.
 */
@Service
public class CmsActivityHistoryServer {

    @Resource
    FavorStockDao favorStockDao;

    public void test(){
     //   cmsActivityHistoryDao.count();
        List<FavorStock> favorStockList = favorStockDao.getListEntity(new FavorStock());
        FavorStock ele =  favorStockList.get(0);
        favorStockDao.count();
    }
}
