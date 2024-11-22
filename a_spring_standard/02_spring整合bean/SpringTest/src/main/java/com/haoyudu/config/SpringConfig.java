package com.haoyudu.config;

import com.haoyudu.dao.AccountDaoBean;
import com.haoyudu.service.AccountServiceBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan({"com.haoyudu.account","com.haoyudu.dao","com.haoyudu.service"})
@Import({JdbcConfig.class/*, AccountDaoBean.class(不传这个bean也可以,因为application中没有调用dao的需求)*/, AccountServiceBean.class})
public class SpringConfig {
}
