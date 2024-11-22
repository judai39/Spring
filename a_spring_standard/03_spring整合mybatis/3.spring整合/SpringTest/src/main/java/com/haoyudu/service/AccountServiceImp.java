package com.haoyudu.service;

import com.haoyudu.account.Account;
import com.haoyudu.dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AccountServiceImp implements AccountService{

    @Autowired
    private AccountDao accountDao;

    @Override
    public void insertAccount(Account account) {
        accountDao.insert(account);
    }
}
