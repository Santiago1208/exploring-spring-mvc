package com.bolsadeideas.springboot.web.app.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bolsadeideas.springboot.web.app.models.User;

@Controller
@RequestMapping("/app")
public class IndexController {
	
	@Value("label.indexController.title")
	private String title;
	
	@GetMapping({"/index", "/", "", "/home"})
	public ModelAndView index(ModelAndView modelAndView) {
		modelAndView.addObject("title", title);
		modelAndView.setViewName("index");
		return modelAndView;
	}
	
	@GetMapping("/profile")
	public ModelAndView viewUserProfile(ModelAndView modelAndView) {
		User user = new User();
		user.setName("Santiago");
		user.setLastname("Restrepo Prado");
		user.setEmail("sanpra1208@gmail.com");
		modelAndView.addObject("user", user);
		modelAndView.setViewName("profile");
		return modelAndView;
	}
	
	@GetMapping("/users")
	public ModelAndView getAllUsers(ModelAndView modelAndView) {
		modelAndView.setViewName("users");
		return modelAndView;
	}
	
	@ModelAttribute("users")
	public List<User> getUsers() {
		List<User> users = new ArrayList<>();
		
		User user1 = new User();
		user1.setName("Santiago");
		user1.setLastname("Restrepo Prado");
		users.add(user1);
		User user2 = new User();
		user2.setName("Sebastian");
		user2.setLastname("Restrepo Prado");
		users.add(user2);
		User user3 = new User();
		user3.setName("María");
		user3.setLastname("Restrepo Prado");
		users.add(user3);
		
		return users;
	}

}
