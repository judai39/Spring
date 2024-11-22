package com.haoyudu.mapper;

import com.haoyudu.account_service.AccountService;
import com.haoyudu.account_service.AccountServiceImp;
import org.springframework.context.annotation.Bean;

public class AccountServiceBean {
    @Bean("ServiceResult")
    public AccountService getServiceResult(){
        return new AccountServiceImp();
    }
}
