package com.springpractice.bean;

public class BeanClass {
	
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public void init() {
		System.out.println("Bean is going through init.");
	}
	
	public void destroy() {
		System.out.println("Bean will be destroyed now.");
	}
}
