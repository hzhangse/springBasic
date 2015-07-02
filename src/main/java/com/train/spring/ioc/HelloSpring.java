package com.train.spring.ioc;

public class HelloSpring implements IHello {
	
	
	public String sayHello() {
		System.out.println("Hello Spring");
		return "Hello Spring";
	}
}
