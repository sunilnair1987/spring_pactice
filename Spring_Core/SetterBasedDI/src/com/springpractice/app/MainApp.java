package com.springpractice.app;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springpractice.bean.TextEditor;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		TextEditor textEditor = (TextEditor)context.getBean("textEditor");
		
		textEditor.spellCheck();
		
		context.close();
	}

}
