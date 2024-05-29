package com.dao;

import java.util.List;

import com.model.Product;

public interface ProductDao {
	
	public void addorUpdateProduct(Product c);
	public List<Product> viewallProduct();
	public void deleteProduct(int id);
	public Product productById(int id);
}
