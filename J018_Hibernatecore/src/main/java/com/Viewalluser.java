package com;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Viewalluser {
	public static void main(String[] args) {
		
		
		
		
		
		Configuration cfg = new Configuration();
		cfg = cfg.configure("hibernate.cfg.xml");
		cfg = cfg.addAnnotatedClass(User.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		
		Session s = sf.openSession();
		
		Transaction tx = null;
		
		tx = s.beginTransaction();
		
		
		List<User> al =  s.createQuery("from User").list();
		
		for(User u : al)
		{
			System.out.println(u);
		}
		
		tx.commit();
		
		
	}
}
