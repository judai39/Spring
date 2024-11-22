package com.haoyudu.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JdbcConfig {
    @Bean
    public DruidDataSource getDataSource(){
        DruidDataSource dataSource=new DruidDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc.mysql://localhost:3306/spring_db");
        dataSource.setUsername("root");
        dataSource.setPassword("DHY2522609443");
        return dataSource;
    }

}
