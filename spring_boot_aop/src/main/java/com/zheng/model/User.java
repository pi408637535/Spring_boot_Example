package com.zheng.model;

/**
 * Created by wode4 on 2016/11/4.
 */
public class User
{
    private String username;
    private String address;

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    @Override
    public String toString()
    {
        return "User{" +
            "username='" + username + '\'' +
            ", address='" + address + '\'' +
            '}';
    }
}
