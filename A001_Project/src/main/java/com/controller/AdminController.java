package com.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import com.model.Category;
import com.model.Order;
import com.model.Product;
import com.service.CategoryService;
import com.service.OrderService;
import com.service.Productservice;
import com.service.UserService;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.http.Part;


@Controller

public class AdminController {

	@Autowired
	UserService userService;
	@Autowired
	CategoryService categoryService;
	
	@Autowired
	Productservice productservice;
	
	@Autowired
	OrderService orderService;
	
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
	
	//************************category start********************
	
	@RequestMapping("/category")
	public String category(Model model)
	{
		model.addAttribute("category", new Category());
		model.addAttribute("categories", categoryService.viewallcategory());
		return "category";
	}
	
	
	
	@RequestMapping(method = RequestMethod.POST,value = "/addCategory")
	public String addCategory(@ModelAttribute("category")Category c)
	{
		categoryService.addorUpdateCategory(c);
		return "redirect:category";
	}
	
	@RequestMapping("/deleteCategory")
	public String deleteCategory(@RequestParam("did") int id)
	{
		categoryService.deleteCategory(id);
		return "redirect:category";
	}
	
	@RequestMapping("/updateCategory")
	public String updateCategory(@RequestParam("eid") int id,Model model)
	{
		model.addAttribute("category", categoryService.catgorybyId(id));
		model.addAttribute("categories", categoryService.viewallcategory());
		return "category";
	}
	
	
	//****************************category end*********************
	
	//*************************products start***************
	
	@RequestMapping("/product")
	public String product(Model model)
	{
		model.addAttribute("product", new Product());
		model.addAttribute("categories", categoryService.viewallcategory());
		model.addAttribute("products", productservice.viewallProduct());
		return "products";
	}
	
	
	@RequestMapping(method = RequestMethod.POST,value = "/addProduct")
	public String addProduct(@ModelAttribute("product") Product p, @RequestParam("catid") int id)
	{
		
	    //String filename=file.getOriginalFilename();  
		Category c = categoryService.catgorybyId(id);
		p.setCategory(c);
		productservice.addorUpdateProduct(p);
		return "redirect:product";
	}
	//********************product end*********************
	
	@RequestMapping("/order")
	public String order()
	{
		List<Order> o  = orderService.viewAllOrder();
		for(Order ol : o)
		{
			System.out.println(ol.getId());
			System.out.println(ol.getPayid());
			String products[] = ol.getPid().split(",");
			String price[] = ol.getPrice().split(",");
			String qty[] = ol.getQty().split(",");
			for(int i=0;i<products.length;i++)
			{
				System.out.println(productservice.productById(Integer.parseInt(products[i])).getPname()+" "+price[i]+" "+qty[i]);
			}
			
		}
		return "order";
	}
	
	
	
}
