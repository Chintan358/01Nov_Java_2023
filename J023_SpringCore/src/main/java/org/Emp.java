package org;

public class Emp {
	
	int id;
	String name;
	String email;
	
	public Emp(int id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}

	public Emp(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public void display() {
		System.out.println(id+" "+name+" "+email);
		
	}
	
	
}
