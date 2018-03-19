package com.wode.stock.dao.impl;


import com.wode.stock.dao.BaseDao;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Optional;

/**
 * Created by piguanghua on 6/7/17.
 */
public abstract class BaseDaoImpl<T> implements BaseDao<T> {


    public abstract Mapper<T> getMapper() ;


    @Override
    public int insert(T entity) {
        return this.getMapper().insert(entity);
    }

    @Override
    public Optional<T> getByPrimary(Long primary) {
        return Optional.ofNullable((T) this.getMapper().selectByPrimaryKey(primary));
    }

    @Override
    public int updateByPrimaryId(T entity) {
        return this.getMapper().updateByPrimaryKeySelective(entity);
    }

    @Override
    public Optional<T> getEntityOne(T t) {
        return Optional.ofNullable((T) this.getMapper().selectOne(t));
    }

    @Override
    public List<T> getListEntity(T t) {
        return this.getMapper().select(t);
    }

    @Override
    public int count() {
        return this.getMapper().selectCount(null);
    }

    @Override
    public int count(T t) {
        return this.getMapper().selectCount(t);
    }

    @Override
    public int deleteByPrimaryKey(T t) {
        return this.getMapper().deleteByPrimaryKey(t);
    }

    @Override
    public int deleteByPrimaryKey(Long primaryId) {
        return this.getMapper().deleteByPrimaryKey(primaryId);
    }
}
