package com.daoimpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dao.ProductDao;
import com.model.Product;

@Repository
@Transactional
public class ProductDaoImpl  implements ProductDao{

	@Autowired
	SessionFactory factory;
	
	@Override
	public void addorUpdateProduct(Product c) {
		Session s  = factory.openSession();
		Transaction tx  =s.beginTransaction();
		s.saveOrUpdate(c);
		tx.commit();
	}

	@Override
	public List<Product> viewallProduct() {
		Session s  = factory.openSession();
		Transaction tx  =s.beginTransaction();
		return s.createQuery("from Product").list();
	}

	@Override
	public void deleteProduct(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Product productById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
