package main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import model.Student;
import model.Subject;


public class AddData {
	public static void main(String[] args) {

		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.addAnnotatedClass(Subject.class).buildSessionFactory();

		Session s = sf.openSession();
		Transaction tx = null;
		tx = s.beginTransaction();

	
		
		
//		Subject s1 = new Subject();
//		s1.setSname("Php");
//		
//		Subject s2 = new Subject();
//		s2.setSname("SQL");
		
		
		Subject s1 = s.load(Subject.class, 1);
		
		Student st = new Student();
		st.setName("Sahil");
		st.setEmail("sahil@gmail.com");
		st.addSubject(s1);
	
		
		
		

		s.save(st);
		
		tx.commit();

	}
}
