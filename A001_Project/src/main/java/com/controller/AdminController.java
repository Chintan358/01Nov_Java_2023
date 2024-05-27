package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.service.UserService;

@Controller
public class AdminController {

	@Autowired
	UserService userService;
	
	@RequestMapping("/admin")
	public String login()
	{
		return "adminlogin";
	}
	
	@RequestMapping("/dashboard")
	public String dashboard()
	{
		return "dashboard";
	}
	
	@RequestMapping("/user")
	public String users(Model model)
	{
		model.addAttribute("users",userService.viewallUser());
		return "user";
	}
	
	@RequestMapping("/category")
	public String category()
	{
		return "category";
	}
	
	@RequestMapping("/product")
	public String product()
	{
		return "products";
	}
	
	@RequestMapping("/order")
	public String order()
	{
		return "order";
	}
	
	
	
}
