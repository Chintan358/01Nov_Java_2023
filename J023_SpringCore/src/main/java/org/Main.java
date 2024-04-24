package org;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		
		
		ClassPathXmlApplicationContext contxt = 
				new ClassPathXmlApplicationContext("applicationcontaxt2.xml");
	
		
		Emp e = contxt.getBean(Emp.class,"emp");
		e.display();
		
	}
}
