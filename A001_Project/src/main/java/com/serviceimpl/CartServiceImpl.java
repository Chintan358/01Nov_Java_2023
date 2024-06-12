package com.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.CartDao;
import com.model.Cart;
import com.service.CartService;

@Service
public class CartServiceImpl implements CartService {

	@Autowired
	CartDao cartDao;
	@Override
	public void addOrUpdateCart(Cart c) {
		// TODO Auto-generated method stub
		cartDao.addOrUpdateCart(c);

	}

	@Override
	public List<Cart> viewAllCart() {
		// TODO Auto-generated method stub
		return cartDao.viewAllCart();
	}

	@Override
	public void deleteCart(int id) {
		// TODO Auto-generated method stub
		cartDao.deleteCart(id);
	}

	@Override
	public Cart cartByid(int id) {
		// TODO Auto-generated method stub
		return  cartDao.cartByid(id);
	}

	@Override
	public List<Cart> cartByUser(int id) {
		// TODO Auto-generated method stub
		return cartDao.cartByUser(id);
	}

}
