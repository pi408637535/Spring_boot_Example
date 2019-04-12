package com.wode.stock.dao;

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

    int deleteByPrimaryKey(Long primaryId);

}
