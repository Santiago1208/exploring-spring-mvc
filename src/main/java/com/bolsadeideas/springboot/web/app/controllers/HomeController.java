package com.bolsadeideas.springboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public ModelAndView redirectExample(ModelAndView modelAndView) {
		modelAndView.setViewName("redirect:/app/index");
		return modelAndView;
	}

	@GetMapping("/google")
	public ModelAndView redirectToGoogleExample(ModelAndView modelAndView) {
		modelAndView.setViewName("redirect:https://www.google.com");
		return modelAndView;
	}

	@GetMapping("/forward")
	public ModelAndView forwardExample(ModelAndView modelAndView) {
		modelAndView.setViewName("forward:/app/index");
		return modelAndView;
	}
}
