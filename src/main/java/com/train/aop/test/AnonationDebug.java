package com.train.aop.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.train.spring.aop.aspectj.AspectBusiness;

public class AnonationDebug {

	public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("conf/annotation_aop.xml");
        AspectBusiness business = (AspectBusiness) context.getBean("aspectBusiness");
        business.delete("猫");
    }

}
