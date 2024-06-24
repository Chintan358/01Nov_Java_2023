package com.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.OrderDao;
import com.model.Order;
import com.model.User;
import com.service.OrderService;

@Service
public class OrderServiceimpl implements OrderService{

	@Autowired
	OrderDao dao;
	
	@Override
	public void addOrUpdateOrder(Order o) {
		// TODO Auto-generated method stub
		dao.addOrUpdateOrder(o);
		
	}

	@Override
	public List<Order> viewAllOrder() {
		// TODO Auto-generated method stub
		return dao.viewAllOrder();
	}

	@Override
	public List<Order> OrderbyUser(User u) {
		// TODO Auto-generated method stub
		return dao.OrderbyUser(u);
	}

}
