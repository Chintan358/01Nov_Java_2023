package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.model.Student;
import com.service.StudentService;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class StudentController {

	@Autowired
	StudentService studentService;
	
	@RequestMapping("/")
	public ModelAndView index() {
		ModelAndView model = new ModelAndView();
		model.addObject("std",new Student());
		model.addObject("data", studentService.viewAllData());
		model.setViewName("index");
		return model;
	}
	
	@RequestMapping("/index")
	public ModelAndView index1() {
		ModelAndView model = new ModelAndView();
		model.addObject("std",new Student());
		model.addObject("data", studentService.viewAllData());
		model.setViewName("index");
		return model;
	}
	
	
	
	@RequestMapping("/reg")
	public ModelAndView registration(@ModelAttribute("std") Student std)
	{
		studentService.addOrUpdateData(std);
		ModelAndView model = new ModelAndView();
		model.addObject("std", new Student());
		model.addObject("data", studentService.viewAllData());
		model.addObject("msg","Registration success");
		model.setViewName("index");
		return model;
	}
	
	@RequestMapping("/delete")
	public RedirectView delete(@RequestParam("did") int id)
	{
		studentService.deleteData(id);
		return new RedirectView("index");
	}
	
	@RequestMapping("/edit")
	public ModelAndView Edit(@RequestParam("eid") int id)
	{
		Student st =  studentService.getById(id);
		ModelAndView model = new ModelAndView();
		model.addObject("std", st);
		model.addObject("data", studentService.viewAllData());
		model.setViewName("index");
		return model;
	}
}



