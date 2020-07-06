package com.bolsadeideas.springboot.web.app.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/params")
public class ParamsController {

	@GetMapping({"/", ""})
	public ModelAndView index(ModelAndView modelAndView) {
		modelAndView.setViewName("params/routes");
		return modelAndView;
	}
	
	@GetMapping("/string")
	public ModelAndView params(@RequestParam(name="text", required=false, defaultValue = "Hello Spring") String text, 
			ModelAndView modelAndView) {
		modelAndView.addObject("result", "The parameter rescued was ".concat(text));
		modelAndView.setViewName("params/view");
		return modelAndView;
	}
	
	@GetMapping("/mix-params")
	public ModelAndView params(@RequestParam String greeting, @RequestParam Integer number, 
			ModelAndView modelAndView) {
		modelAndView.addObject("result", "The parameter rescued was ".concat(greeting).concat(" and number ").concat(number.toString()));
		modelAndView.setViewName("params/view");
		return modelAndView;
	}
	
	@GetMapping("/http-servlet-request")
	public ModelAndView params(HttpServletRequest request, ModelAndView modelAndView) {
		String greeting = request.getParameter("greeting");
		Integer number = Integer.parseInt(request.getParameter("number"));
		modelAndView.addObject("result", "The parameter rescued was ".concat(greeting).concat(" and number ").concat(number.toString()));
		modelAndView.setViewName("params/view");
		return modelAndView;
	}
}
