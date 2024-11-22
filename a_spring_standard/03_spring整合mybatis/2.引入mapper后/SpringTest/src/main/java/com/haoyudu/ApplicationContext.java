package com.haoyudu;

import com.haoyudu.account.Account;
import com.haoyudu.mapper.AccountDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;


public class ApplicationContext {
    public static void main(String[] args) throws IOException {
        SqlSessionFactoryBuilder builder=new SqlSessionFactoryBuilder();
        SqlSessionFactory factory=builder.build(Resources.getResourceAsStream("mybatis_mapper.xml"));
        SqlSession session=factory.openSession();
        AccountDao accountDao=session.getMapper(AccountDao.class);
        accountDao.insert(new Account("mapper",1000.0));
        session.commit();
        session.close();
    }
}
