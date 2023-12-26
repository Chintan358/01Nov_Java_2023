package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class C006_Empcollection {
	public static void main(String[] args) {
		
		
		ArrayList<Employee> emp = new ArrayList<Employee>();
		emp.add(new Employee(10, "Janak", "janak@gmial.com", 52000));
		emp.add(new Employee(5, "Arun", "arun@gmial.com", 50000));
		emp.add(new Employee(7, "Sahil", "bhalani@gmial.com", 96330));
		emp.add(new Employee(11, "Mayank", "dhaduk@gmial.com", 85632));
		
		
		Collections.sort(emp);
		
		Iterator<Employee> itr = emp.iterator();
		while(itr.hasNext())
		{
			Employee e = itr.next();
//			e.display();	
			System.out.println(e);
		}
		
		
	}
}
