package com.train.spring.ioc;

public class HelloWorldSpring implements IHello {
	
	
	public String sayHello() {
		System.out.println("HelloWorldSpring Say:Hello World");
		return "Hello World";
	}
}
