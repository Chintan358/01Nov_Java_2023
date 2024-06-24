package com.dao;

import java.util.List;

import com.model.Order;
import com.model.User;

public interface OrderDao {
	public void addOrUpdateOrder(Order o);
	public List<Order> viewAllOrder();
	public List<Order> OrderbyUser(User u);
}
