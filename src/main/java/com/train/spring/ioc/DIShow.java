package com.train.spring.ioc;

/**
 * 
 * @author Administrator
 *
 */
public class DIShow {
	private IHello helloWorldSpring;

	public IHello getHelloWorldSpring() {
		return helloWorldSpring;
	}

	public void setHelloWorldSpring(IHello helloWorldSpring) {
		this.helloWorldSpring = helloWorldSpring;
	}

	public void sayHello(){
		System.out.println("DIShow say:" + helloWorldSpring.sayHello());
	}
}
