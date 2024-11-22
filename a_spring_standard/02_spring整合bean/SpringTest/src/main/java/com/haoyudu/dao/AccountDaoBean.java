package com.haoyudu.dao;

import com.haoyudu.dao.AccountDao;
import org.springframework.context.annotation.Bean;

public class AccountDaoBean {
    @Bean
    public AccountDao getDao(){
        return new AccountDao();
    }
}
