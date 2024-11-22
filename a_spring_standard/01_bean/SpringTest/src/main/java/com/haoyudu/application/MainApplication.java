package com.haoyudu.application;

import com.haoyudu.account.Account;
import com.haoyudu.factory.AccountFactory;
import com.haoyudu.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("spring_bean_config.xml");
        AccountService service=context.getBean(AccountService.class);
        Account ming = new Account("ming", 1000.0);
        service.setServiceAccount(ming);
        System.out.println(service.getServiceAccount());

        System.out.println(context.getBean(AccountFactory.class).getObject());
        context.close();
    }
}
