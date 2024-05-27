package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.model.User;
import com.service.UserService;

@Controller
public class UserController {

	@Autowired
	UserService userService;
	
	@RequestMapping("/")
	public String index()
	{
		return "index";
	}
	
	@RequestMapping("/home")
	public String home()
	{
		return "index";
	}
	
	@RequestMapping("/cart")
	public String cart()
	{
		return "cart";
	}
	
	@RequestMapping("/shop")
	public String shop()
	{
		return "shop";
	}
	
	@RequestMapping("/details")
	public String details()
	{
		return "details";
	}
	
	@RequestMapping("/contact")
	public String contact()
	{
		return "contact";
	}
	
	@RequestMapping("/login")
	public String login()
	{
		return "login";
	}
	
	@RequestMapping("/reg")
	public String reg(Model model)
	{
		model.addAttribute("user", new User());
		return "reg";
	}
	
	@RequestMapping(method = RequestMethod.POST,value = "/userreg")
	public String userreg(@ModelAttribute("user") User u,Model model)
	{	
		System.out.println(u.getEmail());
		userService.addorUpdateUser(u);
		model.addAttribute("user",new User());
		model.addAttribute("msg", "Registration successfully");
		return "reg";
	}
}
