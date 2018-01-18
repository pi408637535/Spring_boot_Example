package com.study.tkmybatis.dao.impl;

import com.study.tkmybatis.dao.CmsActivityHistoryDao;
import com.study.tkmybatis.mapper.CmsActivityHistoryMapper;
import com.study.tkmybatis.model.CmsActivityHistory;
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
