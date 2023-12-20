package oops;

class St
{
	
	static
	{
		System.out.println("Static block calling...");
	}
	St()
	{
		System.out.println("cons calling...");
	}
	public void display()
	{
		System.out.println("runing display");
	}
}
public class StaticBlock {
	static
	{
		System.out.println("running static of main");
	}
	public static void main(String[] args) {
		
		St s = new St();
		s.display();
	}
	
	
}
