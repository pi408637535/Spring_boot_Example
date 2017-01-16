package com.it.mybatis.annotation.mapper;

import com.it.mybatis.annotation.model.City;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

/**
 * Created by piguanghua on 2017/1/16.
 */
@CacheNamespace(size = 512)
public interface TestMapper {
    @SelectProvider(type = TestSqlProvider.class, method = "getSql")
    @Options(useCache = true, flushCache = Options.FlushCachePolicy.FALSE, timeout = 10000)
    @Results(value = {
            @Result(id = true, property = "id", column = "id", javaType = Long.class, jdbcType = JdbcType.BIGINT),
            @Result(property = "name", column = "name", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Result(property = "state", column = "state", javaType = String.class, jdbcType = JdbcType.VARCHAR)})
    public City get(@Param("id") Long id) ;
}
