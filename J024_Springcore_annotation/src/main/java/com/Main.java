package com;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext con = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Account s =con.getBean("savingAccount",Account.class);
		Account c = con.getBean("currentAccount",Account.class);
		Account l = con.getBean("loan",Account.class);
		
		s.getBalance();
		c.getBalance();
		l.getBalance();
	}
}
