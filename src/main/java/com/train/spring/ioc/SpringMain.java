package com.train.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"conf/applicationContext-*.xml");

		
		DIShow dIShow = (DIShow) context.getBean("DIShow");
		
		dIShow.sayHello();
		
		
	}

}
