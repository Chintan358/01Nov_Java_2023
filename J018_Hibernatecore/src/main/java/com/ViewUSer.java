package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ViewUSer {
	public static void main(String[] args) {
		
		
		
		
		
		Configuration cfg = new Configuration();
		cfg = cfg.configure("hibernate.cfg.xml");
		cfg = cfg.addAnnotatedClass(User.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		
		Session s = sf.openSession();
		
		Transaction tx = null;
		
		tx = s.beginTransaction();
		
		
		User u = s.get(User.class,2);
		
		//System.out.println(u.getId()+" "+u.getEmail()+" "+u.getName());
		System.out.println(u);
		
		tx.commit();
		
		
	}
}
