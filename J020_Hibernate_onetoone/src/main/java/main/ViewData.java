package main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.UserDetails;
import model.UserLogin;

public class ViewData {
	
	public static void main(String[] args) {
		
		
		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(UserLogin.class)
				.addAnnotatedClass(UserDetails.class).buildSessionFactory();

		Session s = sf.openSession();
		Transaction tx = null;
		tx = s.beginTransaction();

//		UserLogin login = s.load(UserLogin.class, 2);
//		
//		System.out.println(login.getId()+" "+login.getUsername()+" "+login.getPassword());
//		UserDetails u = login.getUserDetails();
//		System.out.println(u.getId()+" "+u.getFname()+" "+u.getEmail());
		
		List<UserLogin> al = s.createQuery("from UserLogin").list();
		
		for(UserLogin login  :al)
		{
			System.out.println(login.getId()+" "+login.getUsername()+" "+login.getPassword());
			UserDetails u = login.getUserDetails();
			System.out.println(u.getId()+" "+u.getFname()+" "+u.getEmail());
		}
		
	}
}
