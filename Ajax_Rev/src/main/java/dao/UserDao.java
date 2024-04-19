package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.UserAjax;

public class UserDao {
		
	SessionFactory sessionFactory;
	public UserDao() {
		
		sessionFactory = 
		new Configuration().configure("hibernate.cfg.xml")
		.addAnnotatedClass(UserAjax.class)
		.buildSessionFactory();
	}
	
	
	public void addorUpdateUSer(UserAjax u)
	{
		Session s = sessionFactory.openSession();
		Transaction tx = null;
		tx  =s.beginTransaction();
		s.saveOrUpdate(u);
		tx.commit();
	}
	
	public UserAjax UsrById(int id)
	{
		Session s = sessionFactory.openSession();
		Transaction tx = null;
		tx  =s.beginTransaction();
		return s.load(UserAjax.class, id);
	}
	
	public void deleteUser(int id)
	{
		Session s = sessionFactory.openSession();
		Transaction tx = null;
		tx  =s.beginTransaction();
		UserAjax u =  s.load(UserAjax.class, id);
		s.delete(u);
		tx.commit();
	}
	
	public List<UserAjax> allUser()
	{
		Session s = sessionFactory.openSession();
		Transaction tx = null;
		tx  =s.beginTransaction();
		return s.createQuery("from UserAjax").list();
	}
	
}
