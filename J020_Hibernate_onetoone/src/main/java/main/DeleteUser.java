package main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.UserDetails;
import model.UserLogin;

public class DeleteUser {
	public static void main(String[] args) {

		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(UserLogin.class)
				.addAnnotatedClass(UserDetails.class).buildSessionFactory();

		Session s = sf.openSession();
		Transaction tx = null;
		tx = s.beginTransaction();

		
		UserLogin login = s.load(UserLogin.class, 1);
		s.delete(login);
		
		
		tx.commit();

	}
}
