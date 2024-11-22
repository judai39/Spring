package com.haoyudu.accounts;


import com.haoyudu.account.Account;

public class Accounts {
    private Account[] accounts;

    public Accounts(String name,Double num){
        accounts=new Account[]{new Account(name,num)};
    }

    public Account getAccounts() {
        return accounts[0];
    }

    public void setAccounts(Account[] accounts) {
        this.accounts = accounts;
    }
}
