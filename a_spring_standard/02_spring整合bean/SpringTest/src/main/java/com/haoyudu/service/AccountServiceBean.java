package com.haoyudu.service;

import com.haoyudu.service.AccountService;
import com.haoyudu.service.AccountServiceImp;
import org.springframework.context.annotation.Bean;

public class AccountServiceBean {
    @Bean("AccountService")
    public AccountService getService(){
        return new AccountServiceImp();
    }
}
