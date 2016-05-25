/**
 * TestPropertyBean.java
 *
 * Created on Aug 25, 2011, 10:44:14 AM
 * Copyright (c) 2001-2008 by G2X, Inc. All Rights Reserved.
 */
package com.train.beanload.order.bean;

/**
 * This class
 * 
 * @author Carro.Zhu
 * @version $Revision$, $Date$, $Author$, $Name$
 */
public class TestPropertyBean {

	private String name;

	public TestPropertyBean() {
		System.out.println("TestPropertyBean constructor ...");
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
		this.name = name;
	}

}
