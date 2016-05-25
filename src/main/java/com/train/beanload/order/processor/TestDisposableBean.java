/**
 * TestDisposableBean.java
 *
 * Created on Aug 25, 2011, 12:10:09 PM
 * Copyright (c) 2001-2008 by G2X, Inc. All Rights Reserved.
 */
package com.train.beanload.order.processor;

import org.springframework.beans.factory.DisposableBean;

/**
 * This class
 * 
 * @author Carro.Zhu
 * @version $Revision$, $Date$, $Author$, $Name$
 */
public class TestDisposableBean implements DisposableBean {

	public TestDisposableBean() {
		System.out.println("TestDisposableBean constructor ...");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.beans.factory.DisposableBean#destroy()
	 */
	public void destroy() throws Exception {
		System.out.println("TestDisposableBean.destroy ...");
	}

}
