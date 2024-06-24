package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.Emp;

public class EmpDao {
	
	SessionFactory sf = null;
	public EmpDao() {
		sf  =new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Emp.class).buildSessionFactory();
	}
	
	public void addOrUpdate(Emp e)
	{
		Session s = sf.openSession();
		Transaction tx  =null;
		tx = s.beginTransaction();
		s.saveOrUpdate(e);
		tx.commit();
	}
	
	public void delete(int id)
	{
		Session s = sf.openSession();
		Transaction tx  =null;
		tx = s.beginTransaction();
		s.delete(s.load(Emp.class, id));
		tx.commit();
	}
	
	public Emp empbyid(int id)
	{
		Session s = sf.openSession();
		Transaction tx  =null;
		tx = s.beginTransaction();
		return s.load(Emp.class, id);
		
	}
	
	public List<Emp> viewAllemp()
	{
			Session s = sf.openSession();
			Transaction tx  =null;
			tx = s.beginTransaction();
			return s.createQuery("from Emp").list();
	}
	
	
}
