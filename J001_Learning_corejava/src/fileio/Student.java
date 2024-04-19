package fileio;

import java.io.Serializable;

public class Student implements Serializable {
	
	int id=10;
	String name="Sahil";
	transient String email="sahil@gmail.com";
	
	public void display()
	{
		System.out.println(id+" "+name+" "+email);
	}
	
	
	
	
}
