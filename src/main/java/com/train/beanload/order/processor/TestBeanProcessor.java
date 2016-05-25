/**
 * TestBeanProcessor.java
 *
 * Created on Aug 25, 2011, 11:29:23 AM
 * Copyright (c) 2001-2008 by G2X, Inc. All Rights Reserved.
 */
package com.train.beanload.order.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * This class
 * 
 * @author Carro.Zhu
 * @version $Revision$, $Date$, $Author$, $Name$
 */
public class TestBeanProcessor implements BeanPostProcessor {

	public TestBeanProcessor() {
		System.out.println("TestBeanProcessor constructor ...");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.beans.factory.config.BeanPostProcessor#
	 * postProcessAfterInitialization(java.lang.Object, java.lang.String)
	 */
	public Object postProcessAfterInitialization(Object bean, String beanName)
			throws BeansException {
		System.out
				.println("TestBeanProcessor.postProcessAfterInitialization ... "+beanName);
		return bean;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.beans.factory.config.BeanPostProcessor#
	 * postProcessBeforeInitialization(java.lang.Object, java.lang.String)
	 */
	public Object postProcessBeforeInitialization(Object bean, String beanName)
			throws BeansException {
		System.out
				.println("TestBeanProcessor.postProcessBeforeInitialization ... "+beanName);
		return bean;
	}

}
