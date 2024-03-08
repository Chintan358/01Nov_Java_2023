package collection;

public class Employee implements Comparable<Employee> {
	
	int id;
	String name;
	String email;
	double sal;
	
	public Employee(int id, String name, String email, double sal) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.sal = sal;
	}
	
	public void display()
	{
		System.out.println(id+" "+name+" "+email+" "+sal);
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", sal=" + sal + "]";
	}

	
	@Override
	public int compareTo(Employee o) {
		
		int a = o.id;
		int b = this.id;
		
		int i=0;
		if(b>a)
		{
			i = -1;
		}
		else if(b<a)
		{
			i = 1;
		}
		else
		{
			i=0;
		}
		
		return i;
	}
	
	
	
}
