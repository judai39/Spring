package com.haoyudu;

import com.haoyudu.account.Account;
import com.haoyudu.config.JavaConfig;
import com.haoyudu.dao.AccountDao;
import com.haoyudu.service.AccountService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;


public class ApplicationContext {
    public static void main(String[] args) throws IOException {
//        SqlSessionFactoryBuilder builder=new SqlSessionFactoryBuilder();
//        SqlSessionFactory factory=builder.build(Resources.getResource);
//        SqlSession session=factory.openSession();
//        AccountDao accountDao=session.getMapper(AccountDao.class);
//        accountDao.insert(new Account("mapper",1000.0));
//        session.commit();
//        session.close();

        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
        AccountService accountService=context.getBean(AccountService.class);
        accountService.insertAccount(new Account("springMybatis",20000.0));
        context.close();
    }
}
