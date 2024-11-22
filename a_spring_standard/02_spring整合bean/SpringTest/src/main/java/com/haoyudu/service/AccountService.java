package com.haoyudu.service;

import com.haoyudu.account.Account;
import com.haoyudu.dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public interface AccountService {
    void setNameService(String name);
    String getNameService();
    void setMoneyService(Double money);
    Double getMoneyService();
    void setServiceAccount(Account account);
    Account getServiceAccount();
}


