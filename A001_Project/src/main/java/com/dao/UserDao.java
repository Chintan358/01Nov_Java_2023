package com.dao;

import java.util.List;

import com.model.User;

public interface UserDao {
	
	public void addorUpdateUser(User u);
	public List<User> viewallUser();
	public void deleleUser(int id);
	public User userById(int id);
	public User userLogin(User u);
}
