package com.haoyudu.dao;

import com.haoyudu.account.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class AccountDao {

    @Autowired
    Account account;

    public void setNameDao(String name){
        account.setName(name);
    }

    public String getNameDao(){
        return account.getName();
    }

    public void setMoneyDao(Double money){
        account.moneyChange(money);
    }

    public Double getMoneyDao(){
        return account.getMoney();
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
