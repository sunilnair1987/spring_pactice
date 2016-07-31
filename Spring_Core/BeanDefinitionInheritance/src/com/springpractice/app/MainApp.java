package com.springpractice.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springpractice.bean.BeanClass1;
import com.springpractice.bean.BeanClass2;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		System.out.println("----------BEAN 1----------");
		BeanClass1 objA = (BeanClass1)context.getBean("bean1");
		System.out.println(objA.getMessage1());
		System.out.println(objA.getMessage2());
		objA.foo();
		
		System.out.println("----------BEAN 2----------");
		BeanClass2 objB = (BeanClass2)context.getBean("bean2");
		System.out.println(objB.getMessage1());
		System.out.println(objB.getMessage2());
		System.out.println(objB.getMessage3());
		//objB.foo()   //this does not work. Method inheritance is not possible
	}

}
