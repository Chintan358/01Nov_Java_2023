package com.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.ProductDao;
import com.model.Product;
import com.service.Productservice;

@Service
public class ProductservieImpl implements Productservice {

	@Autowired
	ProductDao dao;
	
	@Override
	public void addorUpdateProduct(Product c) {
		dao.addorUpdateProduct(c);
		
	}

	@Override
	public List<Product> viewallProduct() {
		// TODO Auto-generated method stub
		return dao.viewallProduct();
	}

	@Override
	public void deleteProduct(int id) {
		// TODO Auto-generated method stub
		dao.deleteProduct(id);
		
	}

	@Override
	public Product productById(int id) {
		// TODO Auto-generated method stub
		return dao.productById(id);
	}

}
