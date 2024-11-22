package com.haoyudu.mapper;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;


public class MybatisBean{
    /**��д�ṹ��Ӧ�� spring_project/spring����mybatis/2.����mapper��/
     * �е�mybatis_mapper.xml�е�<setTypeAliasesPackage/> <jdbc.property/>
     * ���ö�Ӧ��.../1.����mapperǰ/�е�daoImp���������ݿ⹦��
     * */
    @Bean
    public SqlSessionFactoryBean sqlSessionFactory(DataSource dataSource){
        SqlSessionFactoryBean sessionFactoryBean=new SqlSessionFactoryBean();
        sessionFactoryBean.setTypeAliasesPackage("com.haoyudu.dao");
        sessionFactoryBean.setDataSource(dataSource);
        return sessionFactoryBean;
    }


    /**��д�ṹ��Ӧ��.../mybatis.xml/�е�<mapper/>
     * ���ö�Ӧ��.../1.����mapperǰ/�е�ServiceImp.class�ķ������ݿ������bean��
     * */
    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer(){
        MapperScannerConfigurer configurer=new MapperScannerConfigurer();
        configurer.setBasePackage("com.haoyudu.dao");
        return configurer;
    }
}
