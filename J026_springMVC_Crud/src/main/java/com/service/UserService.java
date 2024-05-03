package com.service;

import java.util.ArrayList;

import com.model.User;

public interface UserService {
	
		public void addOrUpdateUser(User u);
		public ArrayList<User> viewAllUser();
		public void deleteUser(int id);
		public void userById(int id);
}
