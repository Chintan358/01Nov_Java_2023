package com.daoimpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dao.CategoryDao;
import com.model.Category;

@Repository
@Transactional
public class CategoryImpl implements CategoryDao{

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public void addorUpdateCategory(Category c) {
		
		Session s  =sessionFactory.openSession();
		Transaction tx  =s.beginTransaction();
		s.saveOrUpdate(c);
		tx.commit();
		
	}

	@Override
	public List<Category> viewallcategory() {
		
		Session s  =sessionFactory.openSession();
		Transaction tx  =s.beginTransaction();
		return s.createQuery("from Category").list();
	}

	@Override
	public void deleteCategory(int id) {
	
		Session s  =sessionFactory.openSession();
		Transaction tx  =s.beginTransaction();
		Category ct = s.load(Category.class, id);
		s.delete(ct);
		tx.commit();
		
	}

	@Override
	public Category catgorybyId(int id) {
		
		Session s  =sessionFactory.openSession();
		Transaction tx  =s.beginTransaction();
		Category ct = s.load(Category.class, id);
		return ct;
	}

}
