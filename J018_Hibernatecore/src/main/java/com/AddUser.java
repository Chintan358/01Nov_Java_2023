package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AddUser {
	public static void main(String[] args) {
		
		
		User u = new User();
		u.setId(3);
		u.setName("Mayank-update");
		u.setEmail("mayank@yahoo.com");
		
		
		Configuration cfg = new Configuration();
		cfg = cfg.configure("hibernate.cfg.xml");
		cfg = cfg.addAnnotatedClass(User.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		
		
		Session s = sf.openSession();
		
		Transaction tx = null;
		
		tx = s.beginTransaction();
		
		s.saveOrUpdate(u);
		
		tx.commit();
		
		
	}
}
