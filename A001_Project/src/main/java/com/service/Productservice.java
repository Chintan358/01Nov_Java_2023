package com.service;

import java.util.List;

import com.model.Product;

public interface Productservice {

	public void addorUpdateProduct(Product c);
	public List<Product> viewallProduct();
	public void deleteProduct(int id);
	public Product productById(int id);
}
