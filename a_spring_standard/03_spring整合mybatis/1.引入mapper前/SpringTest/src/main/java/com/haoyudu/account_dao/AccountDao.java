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
    /**mapper������λ��,���������mapper,��Ҫ�̳�AccountDao,
     * ��ʹ�̳е�AccountDaoImp����ΪComponent֪ͨ��������,�������ݿ�ʹ������ݵ�sql���Ҫ�����Ǹ�λ��
     * ����ζ������Ҫ�����ݿ�㼶��dao�㼶���,�������ݿ����������Ҫ�ֶ���д,���һ�������һ��
     * ���ڷ���AccountService��Bean����*/
//    @Insert("insert into spring_tbl(name,money) values('default',0.0)")
    void save(Account account) throws SQLException;

    void delete() throws SQLException;

    void upgrade(Integer id,Account account) throws SQLException;

    List<Account> queryAll() throws SQLException;
}


