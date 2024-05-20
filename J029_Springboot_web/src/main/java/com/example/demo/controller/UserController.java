package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.User;
import com.example.demo.service.UserService;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class UserController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping("/")
	public String index(Model model)
	{
		model.addAttribute("user", new User());
		model.addAttribute("data", userService.viewalluser());
		return "index";
	}
	
	
	
	@RequestMapping(value =  "/reg", method=RequestMethod.POST)
	public String registration(@ModelAttribute("user") User u,Model model)
	{
		userService.addorUpdate(u);
		model.addAttribute("user", new User());
		if(u.getId()>0)
		{
			model.addAttribute("msg", "Update successfull");
		}
		else
		{
		model.addAttribute("msg", "Registration successfull");
		}
		model.addAttribute("data", userService.viewalluser());
		return "index";
	}
	
	@RequestMapping("/delete")
	public String delete(@RequestParam("did") int id)
	{
		userService.deleteUser(id);
		return "redirect:/";
	}
	
	@RequestMapping("/edit")
	public String edit(@RequestParam("eid") int id, Model model)
	{
		
		model.addAttribute("user", userService.userById(id));
		model.addAttribute("data", userService.viewalluser());
		return "index";
	}
	
	
}
