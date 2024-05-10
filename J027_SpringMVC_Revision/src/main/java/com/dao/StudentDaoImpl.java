package com.dao;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.model.Student;

@Repository
@Transactional
public class StudentDaoImpl implements StudentDao {

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public void addOrUpdateData(Student st) {
		
		Session session = sessionFactory.openSession();
		
		Transaction tx = null;
		tx = session.beginTransaction();
		session.saveOrUpdate(st);
		tx.commit();
		
	}

	@Override
	public ArrayList<Student> viewAllData() {
		
		Session session = sessionFactory.openSession();
		
		Transaction tx = null;
		tx = session.beginTransaction();
		return (ArrayList<Student>) session.createQuery("from Student").list();
	}

	@Override
	public void deleteData(int id) {
		Session session = sessionFactory.openSession();
		
		Transaction tx = null;
		tx = session.beginTransaction();
		Student st = session.load(Student.class, id);
		session.delete(st);
		tx.commit();
	}

	@Override
	public Student getById(int id) {
		Session session = sessionFactory.openSession();
		
		Transaction tx = null;
		tx = session.beginTransaction();
		Student st = session.load(Student.class, id);
		return st;
	}

}
