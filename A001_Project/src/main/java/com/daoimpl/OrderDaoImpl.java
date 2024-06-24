package com.daoimpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dao.OrderDao;
import com.model.Order;
import com.model.User;

@Repository
@Transactional
public class OrderDaoImpl implements OrderDao {

	
	@Autowired
	SessionFactory factory;
	
	@Override
	public void addOrUpdateOrder(Order o) {
		
		try {
			Session session = factory.openSession();
			Transaction tx = session.beginTransaction();
			session.saveOrUpdate(o);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		
	}

	@Override
	public List<Order> viewAllOrder() {
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		return session.createQuery("from Order").list();
	}

	@Override
	public List<Order> OrderbyUser(User u) {
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		Query  qry = session.createQuery("from Order o where o.user=:user");
		qry.setParameter("user", u);
		return qry.list();
	}

}
