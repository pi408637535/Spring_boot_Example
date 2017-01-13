package com.it.mybatis.annotation.model;

import java.io.Serializable;

public class City implements Serializable{
    private Long id;

    private String name;

    private String state;

    private String country;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public City()
    {
    }

    public City(String name, String state, String country)
    {
        this.name = name;
        this.state = state;
        this.country = country;
    }
}