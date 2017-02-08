package com.peramdy.dao;

import com.peramdy.utils.JdbcUtils;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Peramdy on 2017/2/7.
 */
public class UserDaoImpl implements IUserDao {


    public Integer login(String username,String password) {
        String sql="select * from user where (name=:name or email=:email)";
        ResultSet resultSet=JdbcUtils.selectSql(sql);
        try {
            while (resultSet.next()){
               String name= resultSet.getString(1);
               String pass= resultSet.getString(2);
               if(name==username&&pass==password){
                   return 1;
               }else if(name==username){
                   return 0;
               }else{
                   return 2;
               }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Integer loginOut(String username) {
        return null;
    }
}
