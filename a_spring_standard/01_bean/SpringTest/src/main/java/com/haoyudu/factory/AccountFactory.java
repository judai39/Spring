package com.haoyudu.factory;

import com.haoyudu.account.Account;
import com.haoyudu.service.AccountService;
import org.springframework.beans.factory.FactoryBean;

//public class AccountFactory {
//    public Account getAccount(){
//        return new Account("default",3000.0);
//    }
//}

public class AccountFactory implements FactoryBean<Account>{
    @Override
    public Account getObject() throws Exception {
        return new Account("default",3000.0);
    }

    @Override
    public Class<?> getObjectType() {
        return Account.class;
    }

    @Override
    public boolean isSingleton() {
        return FactoryBean.super.isSingleton();
    }
}