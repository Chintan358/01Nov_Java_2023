package main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Channel;
import model.Instructor;
import model.Student;
import model.Subject;


public class AddAll {
	public static void main(String[] args) {

		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(Channel.class)
				.addAnnotatedClass(Student.class)
				.addAnnotatedClass(Subject.class).buildSessionFactory();

		Session s = sf.openSession();
		Transaction tx = null;
		tx = s.beginTransaction();

		
		Instructor ins = new Instructor();
		ins.setName("Mansi");
		
		Channel ch = new Channel();
		ch.setChname("codewithmansi");
		ch.setInstructor(ins);
		
		Subject s1 = new Subject();
		s1.setSname("Node");
		s1.setInstructor(ins);
		
		Subject s2 = new Subject();
		s2.setSname("React");
		s2.setInstructor(ins);
		
		Student st = new Student();
		st.setName("xyz");
		st.setEmail("xyz@gmial.com");
		st.addSubject(s1);
		st.addSubject(s2);
		
		
		s.save(ins);
		s.save(ch);
		s.save(s1);
		s.save(s2);
		s.save(st);

		tx.commit();

	}
}
