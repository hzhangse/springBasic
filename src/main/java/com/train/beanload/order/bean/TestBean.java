/**
 * TestBean.java
 *
 * Created on Aug 25, 2011, 10:44:14 AM
 * Copyright (c) 2001-2008 by G2X, Inc. All Rights Reserved.
 */
package com.train.beanload.order.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * This class
 * 
 * @author Carro.Zhu
 * @version $Revision$, $Date$, $Author$, $Name$
 */
public class TestBean implements InitializingBean, BeanNameAware,
		BeanFactoryAware, ApplicationContextAware{

	private String name;

	private TestPropertyBean property;
	
	private String id;

	private BeanFactory context;
	
	public TestBean() {
		System.out.println("TestBean constructor ...");
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		System.out.println("TestBean.setName ...");
		this.name = name;
	}

	/**
	 * @return the property
	 */
	public TestPropertyBean getProperty() {
		return property;
	}

	/**
	 * @param property the property to set
	 */
	public void setProperty(TestPropertyBean property) {
		System.out.println("TestBean.setProperty ...");
		this.property = property;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.springframework.beans.factory.InitializingBean#afterPropertiesSet()
	 */
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("TestBean.afterPropertiesSet ...");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.springframework.beans.factory.BeanNameAware#setBeanName(java.lang
	 * .String)
	 */
	public void setBeanName(String beanName) {
		System.out.println("TestBean.setBeanName ...");
		this.id = beanName;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.springframework.beans.factory.BeanFactoryAware#setBeanFactory(org
	 * .springframework.beans.factory.BeanFactory)
	 */
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("TestBean.setBeanFactory ...");
		this.context = beanFactory;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.springframework.context.ApplicationContextAware#setApplicationContext
	 * (org.springframework.context.ApplicationContext)
	 */
	public void setApplicationContext(ApplicationContext ctxt)
			throws BeansException {
		
		System.out.println("TestBean.setApplicationContext ...");
		this.context = ctxt;
	}

	public void init() {
		System.out.println("TestBean.init ...");
	}

	public void clean() {
		System.out.println("TestBean.clean ...");
	}

}
