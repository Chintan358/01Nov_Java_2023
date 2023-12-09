package oops;

class A
{
	int id=10;
	
	public void display()
	{
		System.out.println("Running display");
		System.out.println("id : "+id);
	}
}

class B extends A
{
	int id = 50;
	public void run()
	{
		int id = 100;
		System.out.println("id : "+id);
		System.out.println("id : "+this.id);
		System.out.println("id : "+super.id);
		System.out.println("Runing run method;");
	}
}

class C extends A
{
	
}
class D extends C
{
	
}

public class O007_InheritanceDemo {
	public static void main(String[] args) {
		
		
		B b = new B();
		b.run();
		
//		System.out.println(new B() instanceof A);
//		System.out.println(new C() instanceof B);
//		System.out.println(new C() instanceof A);
//		System.out.println(new C() instanceof Object);
//		System.out.println(new A() instanceof B);
		
		//up casing
		if(new B() instanceof A)
		{
			A a = new B();
			//a.display();
		}
		
		//down castion
		if(new A() instanceof B)
		{
//			A a1 = new B();
//			B b = (B)  a1;
			
//			B b = (B) new A();
//			b.run();
		}
//		
//		System.out.println("Program ended");
	}
}
