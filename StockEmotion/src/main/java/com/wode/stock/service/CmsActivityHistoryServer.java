package com.wode.stock.service;

import com.wode.stock.dao.CmsActivityHistoryDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by piguanghua on 1/18/18.
 */
@Service
public class CmsActivityHistoryServer {

    @Resource
    CmsActivityHistoryDao cmsActivityHistoryDao;

    public void test(){
        cmsActivityHistoryDao.count();
    }
}
