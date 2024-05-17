package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService userService;
	
	@GetMapping("/")
	public List<User> index()
	{
		List<User> user = userService.viewallUser();
		return user;
	}
	
	@PostMapping("/")
	public String addUser(@RequestBody User u)
	{
		userService.addUser(u);
		return "User added successfully...";
	}
	
	@PutMapping("/")
	public String updateUser(@RequestBody User u)
	{
		userService.updateUser(u);
		return "User updated";
	}
	
	@DeleteMapping("/")
	public String deleteUser(@RequestParam("id") int id)
	{
		userService.deleteUser(id);
		return "user deleted";
	}
}
