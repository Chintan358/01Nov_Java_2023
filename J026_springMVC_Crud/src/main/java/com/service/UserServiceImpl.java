package com.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.UserDao;
import com.model.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao userDao;
	
	@Override
	public void addOrUpdateUser(User u) {
		
		userDao.addOrUpdateUser(u);

	}

	@Override
	public ArrayList<User> viewAllUser() {
		
		return userDao.viewAllUser();
	}

	@Override
	public void deleteUser(int id) {
		userDao.deleteUser(id);

	}

	@Override
	public User userById(int id) {
		return userDao.userById(id);

	}

}
