package com.haoyudu.config;

import com.haoyudu.mapper.AccountServiceBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan({"com.haoyudu.account","com.haoyudu.account_dao","com.haoyudu.account_service"})
@Import({JdbcConfig.class, AccountServiceBean.class})
public class SpringConfig {
}
