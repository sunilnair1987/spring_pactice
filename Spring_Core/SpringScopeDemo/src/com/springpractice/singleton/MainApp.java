package com.springpractice.singleton;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		System.out.println("---------------------------------------");
		System.out.println("            SINGLETON DEMO             ");
		System.out.println("---------------------------------------");
		DemoClass objA = (DemoClass) context.getBean("singletonDemo");
		objA.setMessage("This is object A");
		System.out.println(objA.getMessage());
		
		DemoClass objB = (DemoClass) context.getBean("singletonDemo");
		System.out.println(objB.getMessage());
		
		System.out.println("---------------------------------------");
		System.out.println("            PROTOTYPE DEMO             ");
		System.out.println("---------------------------------------");
		DemoClass objC = (DemoClass)context.getBean("prototypeDemo");
		objC.setMessage("This is object C");
		System.out.println(objC.getMessage());
		
		DemoClass objD = (DemoClass)context.getBean("prototypeDemo");
		System.out.println(objD.getMessage());
		//closing context
		((AbstractApplicationContext) context).close();
	}

}
