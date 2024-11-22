package com.haoyudu.account_service;


import com.haoyudu.account.Account;
import com.haoyudu.account_dao.AccountDao;
import com.haoyudu.account_dao.AccountDaoImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

@Component
public class AccountServiceImp implements AccountService{

    @Autowired
    private AccountDaoImp accountDao;

    @Override
    public void save(Account account) throws SQLException {
        accountDao.save(account);
        System.out.println("save complication!");
    }

    @Override
    public void delete() throws SQLException {
        accountDao.delete();
        System.out.println("delete complication!");
    }

    @Override
    public void upgrade(Integer id,Account account) throws SQLException {
        accountDao.upgrade(id,account);
        System.out.println("upgrade complication!");
    }

    @Override
    public void queryAll() throws SQLException {
        List<Account> accountList=accountDao.queryAll();
        Iterator<Account> iterator=accountList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
