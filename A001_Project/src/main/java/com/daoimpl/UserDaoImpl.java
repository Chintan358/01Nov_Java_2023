package com.daoimpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
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
		try {
			Session s = sessionFactory.openSession();
			Transaction tx = s.beginTransaction();
			User u = s.load(User.class, id);
			s.delete(u);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public User userById(int id) {
		User u = null;
		try {
			Session s = sessionFactory.openSession();
			Transaction tx = s.beginTransaction();
			 u = s.load(User.class, id);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return u;
	}

	@Override
	public User userLogin(User user) {
		
		User u = null;
		try {
			Session s = sessionFactory.openSession();
			Transaction tx = s.beginTransaction();
			Query query = s.createQuery("from User u where u.email=:email and u.pass=:pass");
			query.setParameter("email", user.getEmail());
			query.setParameter("pass", user.getPass());
			u =  (User) query.uniqueResult();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return u;
		
	}

}
