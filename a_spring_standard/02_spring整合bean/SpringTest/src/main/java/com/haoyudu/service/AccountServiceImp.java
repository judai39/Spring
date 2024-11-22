package com.haoyudu.service;

import com.haoyudu.account.Account;
import com.haoyudu.dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class AccountServiceImp implements AccountService {

    @Autowired
    AccountDao accountDao;

    @Override
    public void setNameService(String name) {
        accountDao.setNameDao(name);
    }

    @Override
    public String getNameService() {
        return accountDao.getNameDao();
    }

    @Override
    public void setMoneyService(Double money) {
        accountDao.setMoneyDao(money);
    }

    @Override
    public Double getMoneyService() {
        return accountDao.getMoneyDao();
    }

    @Override
    public void setServiceAccount(Account account) {
        accountDao.setAccount(account);
    }

    @Override
    public Account getServiceAccount() {
        return accountDao.getAccount();
    }

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }


    @PostConstruct
    public void init() {
        System.out.println("init...");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("destroy...");
    }
}
