package com;

import java.util.List;
import java.util.Set;

public class User {
	
	int id;
	String name,email,phone;
	List<String> lang;
	Set<String> sub;
	Address adr;
	List<Info> info;
	
	
	
	public List<Info> getInfo() {
		return info;
	}
	public void setInfo(List<Info> info) {
		this.info = info;
	}
	public Address getAdr() {
		return adr;
	}
	public void setAdr(Address adr) {
		this.adr = adr;
	}
	public Set<String> getSub() {
		return sub;
	}
	public void setSub(Set<String> sub) {
		this.sub = sub;
	}
	public List<String> getLang() {
		return lang;
	}
	public void setLang(List<String> lang) {
		this.lang = lang;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void display()
	{
		System.out.println(id+" "+name+" "+email+" "+phone);
		System.out.println("******lang*****");
		for(String s : lang)
		{
			System.out.println(s);
		}
		System.out.println("******subjects******");
		for(String s  :sub)
		{
			System.out.println(s);
		}
		System.out.println("****address*****");
		adr.display();
		System.out.println("*****phone*****");
		for(Info i : info)
		{
			i.diaply();
		}
	}
}
