package com.haoyudu.service;

import com.haoyudu.account.Account;
import com.haoyudu.accounts.Accounts;
import com.haoyudu.dao.AccountDao;

public interface AccountService {
    void setNameService(String name);
    String getNameService();
    void setMoneyService(Double money);
    Double getMoneyService();
    void setServiceAccount(Account account);
    Account getServiceAccount();
}

class AccountServiceImp implements AccountService{
    private AccountDao accountDao;
//    private Accounts accounts;

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
        accountDao.setAccount(/*accounts.getAccounts()*/account);
    }

    @Override
    public Account getServiceAccount() {
        return accountDao.getAccount();
    }

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

//    public void setAccounts(Accounts accounts) {
//        this.accounts = accounts;
//    }

    public void init(){
        System.out.println("init...");
    }
    public void destroy(){
        System.out.println("destroy...");
    }
}
