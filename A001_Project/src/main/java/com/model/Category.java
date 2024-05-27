package com.model;

import java.util.List;

import javax.persistence.*;




@Entity
@Table(name="category")
public class Category {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	int id;
	@Column(name="catname")
	String categoryName;
	
	@OneToMany(mappedBy = "category",cascade = CascadeType.ALL)
	List<Product> products;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
	
	
}
