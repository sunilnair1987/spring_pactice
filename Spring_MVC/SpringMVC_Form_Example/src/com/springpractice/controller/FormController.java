package com.springpractice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FormController {
	
	/*
	 * HTML forms can be processed by specifying the method type in RequestMapping
	 * annotation. By default the request method type is GET. For sake of clarity
	 * its better if we mention the request method type as GET.
	 */
	@RequestMapping(value="/admissionForm.html", method = RequestMethod.GET)
	public ModelAndView getAdmissionForm() {
		ModelAndView model = new ModelAndView("AdmissionForm");
		return model;
	}
	
	/*
	 * For processing POST request, we should mention the method type as POST.
	 * The request parameters can be accessed similar to path variables.
	 * Instead of @Pathvariable annotation, we have to use @RequestParam("param name") annotation.
	 * If there are many many parameters, they can accessed as key-value pair using Map. Just like
	 * Pathvariables.
	 */
	@RequestMapping(value="/submitForm.html", method = RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@RequestParam("studentName")String name, @RequestParam("studentID")String ID) {
		ModelAndView model = new ModelAndView("Success");
		model.addObject("message", "Student name is " + name + ". Student Id is " + ID + ".");
		
		return model;
	}
}
