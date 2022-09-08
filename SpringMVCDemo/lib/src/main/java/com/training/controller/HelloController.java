package com.training.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@RequestMapping("hello")
	public ModelAndView getHome() {
		return new ModelAndView("hello");
	}
	
	@RequestMapping("greeting")
	public String greeting() {
		return "Hello World!";
	}
}
