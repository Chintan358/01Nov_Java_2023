package com.service;

import java.util.List;

import com.model.User;

public interface UserService {
	
	public void addorUpdateUser(User u);
	public List<User> viewallUser();
	public void deleleUser(int id);
	public User userById(int id);
	
}
