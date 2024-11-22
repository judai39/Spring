package com.haoyudu.account_dao;

import com.haoyudu.account.Account;
import com.haoyudu.utils.ConnectionGet;
import org.springframework.stereotype.Component;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Component
public class AccountDaoImp implements AccountDao{
    private static final String URL = "jdbc:mysql://localhost:3306/spring_db?useSSL=false"; // 数据库地址
    private static final String USER = "root"; // 数据库用户名
    private static final String PASSWORD = "DHY2522609443"; // 数据库密码

    @Override
    public void save(Account account) throws SQLException {
        try (Connection connection=getTryConnection()) {
            // 开始事务
            connection.setAutoCommit(false);

            // 执行一系列SQL操作
            Statement statement=connection.createStatement();
//            statement.executeUpdate("insert into spring_tbl(name,salary)values('default',0.0)");
            statement.executeUpdate("insert into spring_tbl(name,salary)values('"+account.getName()+"','"+account.getSalary()+"')");
            // 提交事务
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
            // 发生异常时回滚事务
            Connection connection=ConnectionGet.getConnection(URL,USER,PASSWORD);
            connection.rollback();
        }

    }

    @Override
    public void delete() throws SQLException {
        try (Connection connection=getTryConnection()) {
            // 开始事务
            connection.setAutoCommit(false);
            // 执行一系列SQL操作
            Statement statement=connection.createStatement();
            statement.executeUpdate("DELETE FROM spring_tbl ORDER BY id DESC LIMIT 1");
            // 提交事务
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
            // 发生异常时回滚事务
            getTryConnection().rollback();
        }
    }

    @Override
    public void upgrade(Integer id,Account account) throws SQLException {
        try (Connection connection=getTryConnection()) {
            // 开始事务
            connection.setAutoCommit(false);
            // 执行一系列SQL操作
            Statement statement=connection.createStatement();
            statement.executeUpdate("UPDATE spring_tbl SET NAME='"+account.getName()+"',SALARY="+account.getSalary()+" WHERE ID="+id+"");
            // 提交事务
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
            // 发生异常时回滚事务
            getTryConnection().rollback();
        }
    }

    @Override
    public List<Account> queryAll() throws SQLException {
        List<Account> accountList=new ArrayList<>();
        try (Connection connection=getTryConnection()) {
            // 开始事务
            connection.setAutoCommit(false);

            // 执行一系列SQL操作
            String sql="SELECT * FROM spring_tbl";
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
            ResultSet rs= preparedStatement.executeQuery(sql);
            while (rs.next()){
                int id=rs.getInt("id");
                String name=rs.getString("name");
                Double salary=rs.getDouble("salary");
                Account account=new Account(id,name,salary);
                accountList.add(account);
            }
            // 提交事务
            rs.close();
//            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
            // 发生异常时回滚事务
            getTryConnection().rollback();
        }
        return accountList;
    }


    private Connection getTryConnection() throws SQLException {
        return ConnectionGet.getConnection(URL,USER,PASSWORD);
    }
}
