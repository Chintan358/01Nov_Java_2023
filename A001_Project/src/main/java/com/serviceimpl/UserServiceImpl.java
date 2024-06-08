package com.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.UserDao;
import com.model.User;
import com.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao userDao;
	
	@Override
	public void addorUpdateUser(User u) {
		// TODO Auto-generated method stub
		userDao.addorUpdateUser(u);
	}

	@Override
	public List<User> viewallUser() {
		// TODO Auto-generated method stub
		return userDao.viewallUser();
	}

	@Override
	public void deleleUser(int id) {
		// TODO Auto-generated method stub
		userDao.deleleUser(id);
	}

	@Override
	public User userById(int id) {
		// TODO Auto-generated method stub
		return userDao.userById(id);
	}

	@Override
	public User userLogin(User u) {
		
		return userDao.userLogin(u);
	}

}
