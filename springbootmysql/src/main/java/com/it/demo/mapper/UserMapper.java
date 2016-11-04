package com.it.demo.mapper;


import java.util.List;

import com.it.demo.bean.User;
import org.apache.ibatis.annotations.Select;

/**
 * Created by piguanghua on 2016/10/16.
 */
public interface UserMapper {
    @Select("select * from user where name like #{name}")
    public List<User> likeName(String name);

    @Select("select * from user where id = #{id}")
    public User getById(long id);

    @Select("select name from user where id = #{id}")
    public String getNameById(long id);
}
