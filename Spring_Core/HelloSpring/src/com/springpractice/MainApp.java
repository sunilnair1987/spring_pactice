package com.springpractice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		HelloWorld obj = (HelloWorld)context.getBean("helloWorld");
		
		System.out.println("Your message: " + obj.getMessage());
		
		((AbstractApplicationContext) context).close();
	}
}
