package com.controller;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.model.Cart;
import com.model.Product;
import com.model.User;
import com.service.CartService;
import com.service.CategoryService;
import com.service.Productservice;
import com.service.UserService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import org.json.JSONObject;
import com.razorpay.*;

@Controller
public class UserController {

	@Autowired
	UserService userService;
	@Autowired
	CategoryService categoryService;
	@Autowired
	Productservice productservice;
	@Autowired
	CartService cartService;
	
	@RequestMapping("/payment")
	public void payment(HttpServletRequest request,HttpServletResponse response)
	{
		  double amt = Double.parseDouble(request.getParameter("amt"));	
		  JSONObject orderRequest = new JSONObject();
		  orderRequest.put("amount", amt*100); // amount in the smallest currency unit
		  orderRequest.put("currency", "INR");
		  orderRequest.put("receipt", "order_rcptid_11");
		  RazorpayClient razorpay;
		try {
			razorpay = new RazorpayClient("rzp_test_KaVziyeak3IQl4", "WjEm1HDZKRcwBK2lpKme8qnl");
			 Order order = razorpay.orders.create(orderRequest);
			 PrintWriter  pw  = response.getWriter();
			  
			 pw.append(order.toString());
		
		} catch (RazorpayException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	}
	
	@RequestMapping("/")
	public String index()
	{
		return "redirect:home";
	}
	
	@RequestMapping("/home")
	public String home(Model model)
	{
		model.addAttribute("categories", categoryService.viewallcategory());
		model.addAttribute("products", productservice.viewallProduct());
		
		return "index";
	}
	
	@RequestMapping("/cart")
	public String cart(HttpSession session,Model model)
	{
		Integer userid = (Integer) session.getAttribute("userid");
		if(userid==null) {
			model.addAttribute("user", new User());
			model.addAttribute("err", "Please login first !!!!");
			return "login";
		}
		else
		{
			double sum = 0;
			for(Cart c : cartService.cartByUser(userid))
			{
				double stotal = c.getProduct().getPrice()*c.getQty();
				sum = sum+stotal;
			}
			
			model.addAttribute("cartdata", cartService.cartByUser(userid));
			model.addAttribute("total", sum);
			return "cart";
		}
		
	}
	
	@RequestMapping("/addtocart")
	public String addtocart(@RequestParam("pid") int pid,HttpSession session,Model model)
	{
		Integer userid = (Integer) session.getAttribute("userid");
		if(userid==null) {
			model.	addAttribute("user", new User());
			model.addAttribute("err", "Please login first !!!!");
			return "login";
		}
		else
		{
			Cart c = new Cart();
			c.setProduct(productservice.productById(pid));
			c.setUser(userService.userById(userid));
			c.setQty(1);
			cartService.addOrUpdateCart(c);
			return "cart";
		}
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
	public String login(Model model)
	{
		model.addAttribute("user", new User());
		return "login";
	}
	
	@RequestMapping(value = "/userlogin", method = RequestMethod.POST)
	public String userlogin(@ModelAttribute("user") User u,Model model,HttpSession session)
	{
		User user = userService.userLogin(u);
		if(user==null)
		{
			
			model.addAttribute("err", "Invalid credentails");
			return "login";
		}
		else
		{
			session.setAttribute("userid", user.getId());
			System.out.println("userid : "+session.getAttribute("userid"));
			return "redirect:home";
		}
	}
	
	@RequestMapping("/logout")
	public String logout(HttpSession session)
	{
		session.invalidate();
		return "redirect:home";
	}
	
	
	@RequestMapping("/reg")
	public String reg(Model model)
	{
		model.addAttribute("user", new User());
		return "reg";
	}
	
	@RequestMapping(method = RequestMethod.POST,value = "/userreg")
	public String userreg(@Valid @ModelAttribute("user") User u,Model model,BindingResult br)
	{	
		
		if(br.hasErrors())
		{
			System.out.println("err");
			return "reg";
		}
		else
		{
			
		System.out.println("success");
		userService.addorUpdateUser(u);
		model.addAttribute("user",new User());
		model.addAttribute("msg", "Registration successfully");
		return "reg";
		}
	}
}
