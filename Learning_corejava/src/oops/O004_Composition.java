package oops;

class Demo
{
	
	int i = 20;
	public void run()
	{
		System.out.println("Calling run method");
	}
}

class Sample
{
	static Demo demo = new Demo();
	public void display()
	{
		System.out.println("runing display...");
	}
}

public class O004_Composition {
	public static void main(String[] args) {
		
		Sample sample = new Sample();
		sample.display();
		
		Sample.demo.run();
		//System.out.println();
	}
}
