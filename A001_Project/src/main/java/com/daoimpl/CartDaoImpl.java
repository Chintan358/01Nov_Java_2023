package com.daoimpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dao.CartDao;
import com.model.Cart;
import com.model.Category;
import com.model.User;
import com.service.CartService;

@Repository
@Transactional
public class CartDaoImpl implements CartDao {

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public void addOrUpdateCart(Cart c) {
		
		Session s  =sessionFactory.openSession();
		Transaction tx  =s.beginTransaction();
		s.saveOrUpdate(c);
		tx.commit();

	}

	@Override
	public List<Cart> viewAllCart() {
		Session s  =sessionFactory.openSession();
		Transaction tx  =s.beginTransaction();
		return s.createQuery("from Cart").list();
	}

	@Override
	public void deleteCart(int id) {
		Session s  =sessionFactory.openSession();
		Transaction tx  =s.beginTransaction();
		Cart c = s.load(Cart.class, id);
		s.delete(c);
		tx.commit();	
		
	}

	@Override
	public Cart cartByid(int id) {
		Session s  =sessionFactory.openSession();
		Transaction tx  =s.beginTransaction();
		Cart c = s.load(Cart.class, id);
		return c;
	}

	@Override
	public List<Cart> cartByUser(int id) {
		Session s  =sessionFactory.openSession();
		Transaction tx  =s.beginTransaction();
		
		Query query = s.createQuery("from Cart c where c.user=:user");
		query.setParameter("user", s.load(User.class, id));
		return query.list();
	}

}
