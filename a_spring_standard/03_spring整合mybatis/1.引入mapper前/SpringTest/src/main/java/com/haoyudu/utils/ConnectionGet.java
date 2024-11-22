package com.haoyudu.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionGet {
    public static Connection getConnection(String URL,String USER,String PASSWORD) {
        Connection connection = null;
        try {
            // 加载 JDBC 驱动
            Class.forName("com.mysql.jdbc.Driver");
            // 获取数据库连接
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("数据库连接成功！");
        } catch (ClassNotFoundException e) {
            System.out.println("找不到 JDBC 驱动！" + e.getMessage());
        } catch (SQLException e) {
            System.out.println("数据库连接失败！" + e.getMessage());
        }
        return connection;
    }
}
