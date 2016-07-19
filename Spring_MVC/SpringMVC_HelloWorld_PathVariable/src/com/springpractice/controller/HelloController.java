package com.springpractice.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController{

	/*
	 * Path variable can be accessed individually. By specifying each variable as a
	 * function parameter. i.e. function(@PathVariabl("variableName") String variable1, ...)
	 * 
	 */
	@RequestMapping("/welcome/{countryName}/{userName}")
	public ModelAndView helloWorld(@PathVariable("userName") String name, @PathVariable("countryName") String country) {
		ModelAndView model = new ModelAndView("HelloPage");
		model.addObject("welcomeMessage", "Hello " + name + ". You are from " + country);
		
		return model;
	}
	
	/*
	 * The above mentioned method of accessing path variable, makes sense if number of path variable are less.
	 * If there are a lot of path variables then we can access them as a key-value pair using Map.
	 * e.g. function(@PathVariable Map<String, String> variableName). Also see the dispatcher-servlet xml
	 * file. To access path variable as map, we need to add a additional tag
	 */
	@RequestMapping("/hi/{countryName}/{userName}")
	public ModelAndView hiWorld(@PathVariable Map<String, String> pathVars) {
		ModelAndView model = new ModelAndView("HelloPage");
		String name = pathVars.get("userName");
		String country = pathVars.get("countryName");
		model.addObject("welcomeMessage", "Hello " + name + ". You are from " + country);
		
		return model;
	}

}
