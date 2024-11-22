package com.haoyudu.mapper;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;


public class MybatisBean{
    /**书写结构对应于 spring_project/spring整合mybatis/2.引入mapper后/
     * 中的mybatis_mapper.xml中的<setTypeAliasesPackage/> <jdbc.property/>
     * 作用对应于.../1.引入mapper前/中的daoImp的连接数据库功能
     * */
    @Bean
    public SqlSessionFactoryBean sqlSessionFactory(DataSource dataSource){
        SqlSessionFactoryBean sessionFactoryBean=new SqlSessionFactoryBean();
        sessionFactoryBean.setTypeAliasesPackage("com.haoyudu.dao");
        sessionFactoryBean.setDataSource(dataSource);
        return sessionFactoryBean;
    }


    /**书写结构对应于.../mybatis.xml/中的<mapper/>
     * 作用对应于.../1.引入mapper前/中的ServiceImp.class的返回数据库对象至bean池
     * */
    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer(){
        MapperScannerConfigurer configurer=new MapperScannerConfigurer();
        configurer.setBasePackage("com.haoyudu.dao");
        return configurer;
    }
}
