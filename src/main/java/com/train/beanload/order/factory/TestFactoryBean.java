/**
 * TestFactoryBean.java
 *
 * Created on Aug 25, 2011, 4:17:28 PM
 * Copyright (c) 2001-2008 by G2X, Inc. All Rights Reserved.
 */
package com.train.beanload.order.factory;

import java.util.Iterator;
import java.util.Map;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactoryUtils;
import org.springframework.beans.factory.config.AbstractFactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import com.train.beanload.order.bean.TestPropertyBean;

/**
 * This class
 *
 * @author Carro.Zhu
 * @version $Revision$, $Date$, $Author$, $Name$
 */
public class TestFactoryBean extends AbstractFactoryBean implements
		ApplicationContextAware {
	
	private ApplicationContext ctxt;
	
	private String className;
	
	public TestFactoryBean() {
		System.out.println("TestFactoryBean constructor ...");
	}
	
	/**
	 * @param className the className to set
	 */
	public void setClassName(String className) {
		this.className = className;
	}

	public void setApplicationContext(ApplicationContext ctxt)
			throws BeansException {
		System.out.println("--------------------------------------------");
		System.out.println("TestFactoryBean.setApplicationContext ...");
		System.out.println("--------------------------------------------");
		this.ctxt = ctxt;
	}

	@Override
	protected Object createInstance() throws Exception {
		System.out.println("--------------------------------------------");
		System.out.println("TestFactoryBean.createInstance ...");
		if (ctxt != null) {
			Map result = BeanFactoryUtils.beansOfTypeIncludingAncestors(ctxt, Class.forName(className));
			Iterator namesIter = result.keySet().iterator();
			System.out.println("TestPropertyBean Beans");
			while (namesIter.hasNext()) {
				String name = (String) namesIter.next();
				System.out.println("beanName = " + name + ", bean = " + result.get(name));
			}
			System.out.println("--------------------------------------------");
			namesIter = result.keySet().iterator();
			if (namesIter.hasNext()) {
				return result.get(namesIter.next());
			}
		}
		return null;
	}

	@Override
	public Class getObjectType() {
		System.out.println("--------------------------------------------");
		System.out.println("TestFactoryBean.getObjectType ...");
		System.out.println("--------------------------------------------");
		return TestPropertyBean.class;
	}

}
