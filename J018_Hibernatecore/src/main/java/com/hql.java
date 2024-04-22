package com;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;



public class hql {
	public static void main(String[] args) {
		
		
		
		
		
		Configuration cfg = new Configuration();
		cfg = cfg.configure("hibernate.cfg.xml");
		cfg = cfg.addAnnotatedClass(User.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		
		Session s = sf.openSession();
		
		Transaction tx = null;
		
		tx = s.beginTransaction();
		
		//seelct  * from user where name = "arun"
//		User u =  (User) s.createQuery("from User u where u.name='arun'").uniqueResult();
//		System.out.println(u.getName());
		
		
//		Query query = s.createQuery("from User u where u.name=:abc");
//		query.setParameter("abc", "arun");
//		User u = (User) query.uniqueResult();
//		System.out.println(u.getEmail());
		
		
		
		
		
		
		
		
	}
}
