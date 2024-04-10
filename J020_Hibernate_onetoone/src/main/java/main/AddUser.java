package main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.UserDetails;
import model.UserLogin;

public class AddUser {
	public static void main(String[] args) {

		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(UserLogin.class)
				.addAnnotatedClass(UserDetails.class).buildSessionFactory();

		Session s = sf.openSession();
		Transaction tx = null;
		tx = s.beginTransaction();

		
		
		UserDetails detials = new UserDetails();
		detials.setFname("Arun");
		detials.setLname("Jethva");
		detials.setEmail("arun@gmial.com");
		
		
		UserLogin login = new UserLogin();
		login.setUsername("Arun");
		login.setPassword("arun123");
		login.setUserDetails(detials);
		
		s.save(login);
		
		tx.commit();

	}
}
