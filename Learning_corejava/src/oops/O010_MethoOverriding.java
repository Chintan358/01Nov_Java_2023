package oops;

class Parent
{
	public void display()
	{
		System.out.println("Running parent class diplsay method");
	}
	
	
}
class Child extends Parent
{
	@Override
	public void display() {
		System.out.println("Runing child class display");
		//super.display();
	}
}

public class O010_MethoOverriding {
	public static void main(String[] args) {
		
		Child ch = new Child();
		ch.display();
		
		
	}
}
