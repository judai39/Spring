package com.haoyudu.account_dao;

import com.haoyudu.account.Account;
import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;


public interface AccountDao {
    /**mapper的作用位置,如果不引入mapper,需要继承AccountDao,
     * 并使继承的AccountDaoImp声明为Component通知容器管理,连接数据库和处理数据的sql语句要放在那个位置
     * 这意味着我们要把数据库层级和dao层级混合,并且数据库的连接依旧要手动书写,并且还遗留了一个
     * 用于返回AccountService的Bean对象*/
//    @Insert("insert into spring_tbl(name,money) values('default',0.0)")
    void save(Account account) throws SQLException;

    void delete() throws SQLException;

    void upgrade(Integer id,Account account) throws SQLException;

    List<Account> queryAll() throws SQLException;
}


