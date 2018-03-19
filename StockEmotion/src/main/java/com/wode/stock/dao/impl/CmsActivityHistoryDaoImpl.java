package com.wode.stock.dao.impl;

import com.wode.stock.dao.CmsActivityHistoryDao;
import com.wode.stock.mapper.CmsActivityHistoryMapper;
import com.wode.stock.model.CmsActivityHistory;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import javax.annotation.Resource;

/**
 * Created by piguanghua on 1/18/18.
 */
@Repository
public class CmsActivityHistoryDaoImpl extends BaseDaoImpl<CmsActivityHistory> implements CmsActivityHistoryDao {

    @Resource
    CmsActivityHistoryMapper cmsActivityHistoryMapper;


    @Override
    public Mapper<CmsActivityHistory> getMapper() {
        return cmsActivityHistoryMapper;
    }
}
