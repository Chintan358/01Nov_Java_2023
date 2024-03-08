package oops;

class Student
{
	int id;
	String name;
	
	Student()
	{
		System.out.println("Constructor calling..");
	}
	
	Student(int i)
	{
		System.out.println("value : "+i);
	}
	
	Student(String name)
	{
		System.out.println("name is : "+name);
	}
	
	
	
	public Student(int id, String name) {
		
		this.id = id;
		this.name = name;
	}

	public void display()
	{
		System.out.println(id+" "+name);
	}
}

public class O002_Constructor {
	public static void main(String[] args) {
		
		//Student st = new Student();
		//Student st = new Student(10);
		//Student st = new Student("Hello");
		
		Student st = new Student(10,"Janak");
		st.display();
		
		Student st1 = new Student(20,"Tops");
		st1.display();
		
//		Access a = new Access();
//		a.print();
	}
}
