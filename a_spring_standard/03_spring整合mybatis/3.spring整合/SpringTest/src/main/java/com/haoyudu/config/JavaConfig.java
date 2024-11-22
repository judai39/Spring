package com.haoyudu.config;

import com.haoyudu.mapper.MybatisBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan({"com.haoyudu.account","com.haoyudu.service","com.haoyudu.dao"})
@PropertySource("classpath:jdbc.properties")
@Import({JdbcConfig.class, MybatisBean.class})
public class JavaConfig {
}
