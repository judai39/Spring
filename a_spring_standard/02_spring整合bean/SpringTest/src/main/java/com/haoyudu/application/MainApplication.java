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
        /**���ں�������,�ص�����,��θ���������Ϣ����,��δ��������ö���,�����Ŀ�����ر�,�����ֶ��������Զ�����(ϵͳ��æ����)*/
        //1.������Ϣ��������
//        ApplicationContext context=new ClassPathXmlApplicationContext("application_context.xml");
//        ApplicationContext context=new FileSystemXmlApplicationContext("����·��")
//        AbstractApplicationContext context=new ClassPathXmlApplicationContext("application_context.xml");/**ApplicationContext�޷�close.�������*/
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);

        //2.���������ö���
        AccountService service= context.getBean("AccountService", AccountService.class);
//        AccountService service1=(AccountService) context.getBean("accountService");
        AccountService service2=context.getBean("AccountService",AccountService.class);/**����ǿת��,��Ϊ�����д����˷���*/
        System.out.println(service.getServiceAccount());
//        context.close();  ��һ����A,�ڶ�������,���������,����Ҫ��������


        //3.����...

        //4.�ֶ���������
//        Resource resources=new ClassPathResource("application_context.xml");
//        BeanFactory beanFactory=new XmlBeanFactory(resources);
//        AccountService serviceByBeanFactory=beanFactory.getBean(AccountService.class);
//        System.out.println(serviceByBeanFactory.getServiceAccount());
    }
}
