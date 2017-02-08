package com.peramdy.utils;

import java.sql.*;

/**
 * Created by Peramdy on 2017/2/8.
 */
public class JdbcUtils {

    public static Connection getConnection(){
        String url="jdbc:mysql://localhost:3306/test";
        String userName="root";
        String passWords="";
        Connection connection=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection= DriverManager.getConnection(url,userName,passWords);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }


    public static ResultSet selectSql(String sql){
        ResultSet resultSet=null;
        PreparedStatement preparedStatement=null;
        try {
            preparedStatement=getConnection().prepareStatement(sql);
            resultSet=preparedStatement.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if(preparedStatement!=null)
                    preparedStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
         return resultSet;
    }

    public static Connection getConnection2(){
        String url= (String)PropertiesUtils.getValue("jdbc.url","/jdbc.properties");
        String userName= (String)PropertiesUtils.getValue("jdbc.username","/jdbc.properties");
        String password= (String)PropertiesUtils.getValue("jdbc.password","/jdbc.properties");
        String driver= (String)PropertiesUtils.getValue("jdbc.driver","/jdbc.properties");
        Connection connection=null;
        try {
            Class.forName(driver);
            connection= DriverManager.getConnection(url,userName,password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }

}
