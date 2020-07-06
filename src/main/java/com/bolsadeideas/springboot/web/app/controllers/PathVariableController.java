package com.bolsadeideas.springboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/path-variable")
public class PathVariableController {
	
	@GetMapping({"/", ""})
	public ModelAndView index(ModelAndView modelAndView) {
		modelAndView.setViewName("params/index");
		return modelAndView;
	}

	@GetMapping("/string/{text}")
	public ModelAndView variables(@PathVariable String text, ModelAndView modelAndView) {
		modelAndView.addObject("result", "The path parameter rascued was ".concat(text));
		modelAndView.setViewName("params/path");
		return modelAndView;
	}
	
	@GetMapping("/string/{text}/{number}")
	public ModelAndView variables(@PathVariable String text, @PathVariable Integer number, ModelAndView modelAndView) {
		modelAndView.addObject("result", "The path parameter rascued was ".concat(text).concat(" and number ").concat(number.toString()));
		modelAndView.setViewName("params/path");
		return modelAndView;
	}
	
}
