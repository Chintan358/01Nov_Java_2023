package com.dao;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate5.SessionFactoryUtils;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.model.User;


@Transactional
@Repository
public class UserDaoImpl implements UserDao {

	SessionFactory sessionFactory;
	
	
	@Override
	public void addOrUpdateUser(User u) {
		
		Session s  = sessionFactory.openSession();
		Transaction tx = null;
		tx = s.beginTransaction();
		s.saveOrUpdate(u);
		tx.commit();
	}

	@Override
	public ArrayList<User> viewAllUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUser(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void userById(int id) {
		// TODO Auto-generated method stub
		
	}
	
}
