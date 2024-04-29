package com.cotroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Usercontroller {
	
	@RequestMapping("/")
	public String arun()
	{
		return "index";
	}
	
	@RequestMapping("/index")
	public String index()
	{
		return "index";
	}
	
	@RequestMapping("/home")
	public ModelAndView home()
	{
		ModelAndView model = new ModelAndView();
		model.addObject("uname", "Test");
		model.setViewName("Home");
		return model;
	}
	
	@RequestMapping("/about")
	public String about()
	{
		return "About";
	}
}
