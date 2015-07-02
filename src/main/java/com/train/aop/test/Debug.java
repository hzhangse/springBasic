package com.train.aop.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.train.spring.aop.schema.base.IBaseBusiness;

public class Debug {

public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("conf/schema_aop.xml");
        IBaseBusiness business = (IBaseBusiness ) context.getBean("businessProxy");
        business.delete("猫");
    }

}
