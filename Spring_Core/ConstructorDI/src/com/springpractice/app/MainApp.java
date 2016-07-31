package com.springpractice.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springpractice.bean.TextEditor;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		TextEditor te = (TextEditor)context.getBean("textEditor");
		
		te.spellCheck();
		
		((AbstractApplicationContext)context).close();

	}

}
