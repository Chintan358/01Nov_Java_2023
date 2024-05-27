package com.model;

import javax.persistence.*;


@Entity
@Table(name="product")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	int id;
	@Column(name="pname")
	String pname;
	
	@Column(name="price")
	double price;
	
	@Column(name="qty")
	int qty;
	
	@Column(name="img")
	String img;
	
	@ManyToOne(cascade = {CascadeType.MERGE,CascadeType.REFRESH,CascadeType.DETACH,CascadeType.PERSIST})
	@JoinColumn(name="catid")
	Category category;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
	
	
	
}
