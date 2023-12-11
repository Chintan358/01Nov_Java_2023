package oops;

class Calc1
{
	public void add(int a, int b)
	{
		int  r = a+b;
		System.out.println("M1 :  "+r);
	}
	
	public void add(int a, int b,int c)
	{
		int  r = a+b+c;
		System.out.println("M2:  "+r);
	}
	
	public void add(int a, double b)
	{
		double  r = a+b;
		System.out.println("M3 :  "+r);
	}
}

public class O009_MethodOverloading {
	public static void main(String[] args) {
		
		Calc1 c = new Calc1();
		c.add(10, 20);
		c.add(20, 30 , 54);
		c.add(52, 62.23);
		//main(10);
		
		
		
	}
	
	public static void main(int i) {
		System.out.println(i);
	}
	
	
}
