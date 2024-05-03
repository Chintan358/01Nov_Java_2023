package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.model.User;
import com.service.UserService;

@Controller
public class Usercontroller {
	
	@Autowired
	UserService userService;
	
	@RequestMapping("/")
	public ModelAndView index()
	{
		ModelAndView model = new ModelAndView();
		model.addObject("user", new User());
		model.setViewName("index");
		return model;
	}
	
	@RequestMapping("/reg")
	public ModelAndView Registration(@ModelAttribute("user") User u)
	{
		
		userService.addOrUpdateUser(u);
		ModelAndView model = new ModelAndView();
		model.addObject("user", new User());
		model.setViewName("index");
		return model;
	}
}
