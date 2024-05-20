package com.example.demo.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repo.UserRepo;

@Service
public class UserServiceImpl implements UserService{

	
	@Autowired
	UserRepo repo;
	
	@Override
	public void addorUpdate(User u) {
		
		repo.save(u);
		
	}

	@Override
	public ArrayList<User> viewalluser() {
		
		return (ArrayList<User>) repo.findAll();
	}

	@Override
	public void deleteUser(int id) {
		repo.deleteById(id);
		
	}

	@Override
	public User userById(int id) {
		
		return repo.findById(id).orElseThrow();
		
	}

}
