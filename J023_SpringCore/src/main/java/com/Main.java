package com;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		
		
		ClassPathXmlApplicationContext contxt = 
				new ClassPathXmlApplicationContext("applicationcontaxt.xml");
	
		User u   = contxt.getBean(User.class,"user");
		u.display();
		
		
		
	}
}
