package com.haoyudu;

import com.haoyudu.account.Account;
import com.haoyudu.account_service.AccountService;
import com.haoyudu.config.SpringConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;

public class ApplicationContext {
    public static void main(String[] args) throws SQLException {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);
        AccountService service=context.getBean("ServiceResult", AccountService.class);
//        service.save(new Account("myName",2000.0));
//        service.delete();
        service.upgrade(3,new Account("upgradeName",10000.0));

    }
}
