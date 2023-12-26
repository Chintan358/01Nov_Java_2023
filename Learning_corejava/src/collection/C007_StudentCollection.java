package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class C007_StudentCollection {
	public static void main(String[] args) {
		
		
		ArrayList<Student> emp = new ArrayList<Student>();
		emp.add(new Student(10, "Janak", "janak@gmial.com", 52000));
		emp.add(new Student(5, "Arun", "arun@gmial.com", 50000));
		emp.add(new Student(7, "Sahil", "bhalani@gmial.com", 96330));
		emp.add(new Student(11, "Mayank", "dhaduk@gmial.com", 85632));
		
		
		Collections.sort(emp,new SortById());
		//Collections.sort(emp,new sortByName());
		
		Iterator<Student> itr = emp.iterator();
		while(itr.hasNext())
		{
			Student e = itr.next();
//			e.display();	
			System.out.println(e);
		}
		
		
	}
}
