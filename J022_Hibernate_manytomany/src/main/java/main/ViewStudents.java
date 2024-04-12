package main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import model.Student;
import model.Subject;


public class ViewStudents {
	public static void main(String[] args) {

		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.addAnnotatedClass(Subject.class).buildSessionFactory();

		Session s = sf.openSession();
		Transaction tx = null;
		tx = s.beginTransaction();
		
		List<Student> students = s.createQuery("from Student").list();
		
		for(Student st : students)
		{
			System.out.println(st.getId()+" "+st.getName()+" "+st.getEmail());
			List<Subject> subject = st.getSubjects();
			for(Subject sub : subject)
			{
				System.out.println(sub.getId()+" "+sub.getSname());
			}
			System.out.println("****************");
		}
	
		

		
	

	}
}
