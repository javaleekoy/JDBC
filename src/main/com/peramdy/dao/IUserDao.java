package com.peramdy.dao;

/**
 * Created by Peramdy on 2017/2/7.
 */
public interface IUserDao {

    public Integer login(String username,String password);

    public Integer loginOut(String username);

}
