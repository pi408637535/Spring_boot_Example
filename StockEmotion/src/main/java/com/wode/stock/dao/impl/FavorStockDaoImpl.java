package com.wode.stock.dao.impl;

import com.wode.stock.bean.FavorStock;
import com.wode.stock.dao.FavorStockDao;
import com.wode.stock.mapper.FavorStockMapper;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import javax.annotation.Resource;

/**
 * 
 * @author wanghongda @date 2018年1月19日
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
