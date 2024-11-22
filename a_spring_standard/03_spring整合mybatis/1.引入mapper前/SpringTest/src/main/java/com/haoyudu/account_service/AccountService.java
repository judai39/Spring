package com.haoyudu.account_service;


import com.haoyudu.account.Account;

import java.sql.SQLException;

public interface AccountService{
    void save(Account account) throws SQLException;
    void delete() throws SQLException;
    void upgrade(Integer id,Account account) throws SQLException;
    void queryAll() throws SQLException;
}
