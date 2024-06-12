package com.dao;

import java.util.List;

import com.model.Cart;

public interface CartDao {
	
	public void addOrUpdateCart(Cart c);
	public List<Cart> viewAllCart();
	public void deleteCart(int id);
	public Cart cartByid(int id);
	public List<Cart> cartByUser(int id);
	
}
