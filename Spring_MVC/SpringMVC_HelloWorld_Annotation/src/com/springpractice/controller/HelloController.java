package com.springpractice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/greet")
public class HelloController{

	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {
		ModelAndView model = new ModelAndView("HelloPage");
		model.addObject("welcomeMessage", "Hello World!! Annotation");
		
		return model;
	}

	@RequestMapping("/hi.html")
	public ModelAndView hiWorld() {
		ModelAndView model = new ModelAndView("HelloPage");
		model.addObject("welcomeMessage", "Hi World!! Annotation");
		
		return model;
	}
}
