package com.springpractice.app;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springpractice.bean.BeanClass;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		BeanClass objA = (BeanClass)context.getBean("beanClass");
		System.out.println(objA.getMessage());
		
		context.registerShutdownHook();
		context.close();
	}

}
