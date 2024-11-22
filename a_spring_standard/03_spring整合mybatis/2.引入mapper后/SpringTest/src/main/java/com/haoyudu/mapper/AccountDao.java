package com.haoyudu.mapper;

import com.haoyudu.account.Account;
import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Component;

@Component
public interface AccountDao {
    @Insert("insert into spring_tbl(name,salary)values(#{name},#{salary})")
    void insert(Account account);
}
