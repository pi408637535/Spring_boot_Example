package com.study.tkmybatis.dao;

import java.util.List;
import java.util.Optional;

/**
 * Created by piguanghua on 6/7/17.
 */
public interface BaseDao<T> {
    int insert(T entity);

    Optional<T> getByPrimary(Long primary);

    int updateByPrimaryId(T entity);

    Optional<T> getEntityOne(T t);

    List<T> getListEntity(T t);

    int count();

    int count(T t);

    //Todo 用户关系 兼容考虑
    int deleteByPrimaryKey(T t);

    int deleteByPrimaryKey(Long primaryId);

}
