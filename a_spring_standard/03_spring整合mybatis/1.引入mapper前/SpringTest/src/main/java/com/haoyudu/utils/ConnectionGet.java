package com.haoyudu.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionGet {
    public static Connection getConnection(String URL,String USER,String PASSWORD) {
        Connection connection = null;
        try {
            // ���� JDBC ����
            Class.forName("com.mysql.jdbc.Driver");
            // ��ȡ���ݿ�����
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("���ݿ����ӳɹ���");
        } catch (ClassNotFoundException e) {
            System.out.println("�Ҳ��� JDBC ������" + e.getMessage());
        } catch (SQLException e) {
            System.out.println("���ݿ�����ʧ�ܣ�" + e.getMessage());
        }
        return connection;
    }
}
