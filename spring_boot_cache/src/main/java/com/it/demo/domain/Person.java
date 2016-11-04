package com.it.demo.domain;



import lombok.Getter;
import javax.persistence.Entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by wode4 on 2016/10/21.
 */
@lombok.Setter
@Getter
@Entity
public class Person
{
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Integer age;

    @Column(nullable = false)
    private String address;

    public Person(String name, Integer age, String address)
    {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Person()
    {
    }
}
