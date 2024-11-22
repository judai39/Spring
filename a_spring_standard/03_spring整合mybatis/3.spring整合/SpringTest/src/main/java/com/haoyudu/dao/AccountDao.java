package com.haoyudu.dao;

import com.haoyudu.account.Account;
import org.apache.ibatis.annotations.Insert;


public interface AccountDao {
    @Insert("insert into spring_tbl(name,salary)values(#{name},#{salary})")
    void insert(Account account);
}
