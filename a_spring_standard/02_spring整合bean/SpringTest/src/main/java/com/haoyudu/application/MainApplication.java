package com.haoyudu.application;

import com.haoyudu.account.Account;
import com.haoyudu.config.SpringConfig;
import com.haoyudu.service.AccountService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class MainApplication {
    public static void main(String[] args) {
        /**关于核心容器,重点在于,如何根据配置信息创建,如何从容器中拿东西,容器的开启与关闭,容器手动创建和自动生成(系统帮忙创建)*/
        //1.配置信息创建容器
//        ApplicationContext context=new ClassPathXmlApplicationContext("application_context.xml");
//        ApplicationContext context=new FileSystemXmlApplicationContext("绝对路径")
//        AbstractApplicationContext context=new ClassPathXmlApplicationContext("application_context.xml");/**ApplicationContext无法close.这个可以*/
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);

        //2.从容器里拿东西
        AccountService service= context.getBean("AccountService", AccountService.class);
//        AccountService service1=(AccountService) context.getBean("accountService");
        AccountService service2=context.getBean("AccountService",AccountService.class);/**不用强转了,因为参数中传入了泛型*/
        System.out.println(service.getServiceAccount());
//        context.close();  第一次拿A,第二次再拿,这是允许的,不需要重启容器


        //3.开关...

        //4.手动创建容器
//        Resource resources=new ClassPathResource("application_context.xml");
//        BeanFactory beanFactory=new XmlBeanFactory(resources);
//        AccountService serviceByBeanFactory=beanFactory.getBean(AccountService.class);
//        System.out.println(serviceByBeanFactory.getServiceAccount());
    }
}
