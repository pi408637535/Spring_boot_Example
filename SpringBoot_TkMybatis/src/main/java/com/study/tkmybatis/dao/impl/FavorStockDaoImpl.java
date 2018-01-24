package com.study.tkmybatis.dao.impl;

import com.study.tkmybatis.dao.FavorStockDao;
import com.study.tkmybatis.mapper.FavorStockMapper;
import com.study.tkmybatis.model.FavorStock;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import javax.annotation.Resource;

/**
 * Created by piguanghua on 1/18/18.
 */
@Repository
public class FavorStockDaoImpl extends BaseDaoImpl<FavorStock> implements FavorStockDao {

    @Resource
    FavorStockMapper favorStockMapper;

    @Override
    public Mapper<FavorStock> getMapper() {
        return favorStockMapper;
    }
}
