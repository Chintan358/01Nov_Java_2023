package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repo.UserRepo;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepo repo;
	
	@Override
	public void addUser(User u) {
		
		repo.save(u);
	}

	@Override
	public List<User> viewallUser() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void deleteUser(int id) {
		repo.deleteById(id);
	}

	@Override
	public void updateUser(User u) {
		repo.save(u);
		
	}
	
	

	@Override
	public User userbyId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
