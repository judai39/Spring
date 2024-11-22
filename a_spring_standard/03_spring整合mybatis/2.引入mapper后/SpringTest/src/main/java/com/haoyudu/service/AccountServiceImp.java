package com.haoyudu.service;

import com.haoyudu.account.Account;
import com.haoyudu.mapper.AccountDao;
import org.springframework.stereotype.Component;

@Component
public class AccountServiceImp implements AccountService{
    private AccountDao accountDao;

    @Override
    public void insertAccount(Account account) {
        accountDao.insert(account);
    }
}
