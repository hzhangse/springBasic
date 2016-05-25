package com.train.bean.load.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.train.beanload.order.bean.TestBean;

/**
 * This class
 *
 * @author Carro.Zhu
 * @version $Revision$, $Date$, $Author$, $Name$
 */
public class SpringBeansLoad {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//单一bean测试
	//ClassPathXmlApplicationContext ctxt = new ClassPathXmlApplicationContext("bean.xml");
		//bean id覆盖测试		
	//ClassPathXmlApplicationContext ctxt = new ClassPathXmlApplicationContext(new String[]{"bean.xml", "bean1.xml"},false,null);
	//ctxt.setAllowBeanDefinitionOverriding(false);
//	ctxt.refresh();
		//AbstractFactoryBean以及BeanFactoryUtils测试
		ClassPathXmlApplicationContext ctxt = new ClassPathXmlApplicationContext(new String[]{"bean.xml", "bean1.xml", "bean2.xml"});
		TestBean bean = (TestBean) ctxt.getBean("test");
		System.out.println(bean.getProperty().getName());
		ctxt.close();
	}

}
