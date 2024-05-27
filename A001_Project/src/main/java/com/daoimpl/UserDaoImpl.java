package com.daoimpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dao.UserDao;
import com.model.User;

@Repository
@Transactional
public class UserDaoImpl implements UserDao {

	@Autowired
	SessionFactory sessionFactory;
	@Override
	public void addorUpdateUser(User u) {
		// TODO Auto-generated method stub
		try {
			Session s = sessionFactory.openSession();
			Transaction tx = s.beginTransaction();
			s.saveOrUpdate(u);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<User> viewallUser() {
		try {
			Session s = sessionFactory.openSession();
			Transaction tx = s.beginTransaction();
			return s.createQuery("from User").list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void deleleUser(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User userById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
