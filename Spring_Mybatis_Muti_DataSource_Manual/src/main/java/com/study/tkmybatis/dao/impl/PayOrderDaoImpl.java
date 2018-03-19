package com.study.tkmybatis.dao.impl;

import com.study.tkmybatis.common.datasource.DatabaseContextHolder;
import com.study.tkmybatis.common.datasource.DatabaseType;
import com.study.tkmybatis.dao.PayOrderDao;
import com.study.tkmybatis.mapper.PayOrderMapper;
import com.study.tkmybatis.model.PayOrder;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import javax.annotation.Resource;

/**
 * Created by piguanghua on 2/28/18.
 */
@Repository
public class PayOrderDaoImpl extends BaseDaoImpl<PayOrder> implements PayOrderDao {

    @Resource
    PayOrderMapper payOrderMapper;

    @Override
    public Mapper<PayOrder> getMapper() {
        DatabaseContextHolder.setDatabaseType(DatabaseType.pay4);
        return payOrderMapper;
    }
}
