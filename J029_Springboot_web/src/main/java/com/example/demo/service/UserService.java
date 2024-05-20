package com.example.demo.service;

import java.util.ArrayList;

import com.example.demo.model.User;

public interface UserService {
	
		public void addorUpdate(User u);
		public ArrayList<User> viewalluser();
		public void deleteUser(int id);
		public User userById(int id);
}
