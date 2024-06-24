package com.model;

import javax.persistence.*;



@Entity
@Table(name="order_user")
public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="pid")
	private String pid;
	
	@Column(name="qty")
	private String qty;
	
	@Column(name="price")
	private String price;
	
	@Column(name="total")
	private double total;
	
	@Column(name="payid")
	private String payid;
	
	@ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	@JoinColumn(name="uid")
	User user;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	

	



	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getQty() {
		return qty;
	}

	public void setQty(String qty) {
		this.qty = qty;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public String getPayid() {
		return payid;
	}

	public void setPayid(String payid) {
		this.payid = payid;
	}
	
	
}
