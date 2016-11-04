package com.demo.jpa.dao;

import com.demo.jpa.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;

/**
 * Created by wode4 on 2016/10/21.
 */
public interface PersonRepository extends JpaRepository<Person, Long>
{

    /*
    * 相当于 slect p from Person p where p.name=?1
    * */
    Person findByName(String name);

    Person findByNameAndAge(String name, Integer age);



}
