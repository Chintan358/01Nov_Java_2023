package oops;

class Calc
{
	public void print()
	{
		System.out.println("Running print method...");
	}
	
	public void printName(String name)
	{
		System.out.println("Name is : "+name);
	}
	
	public void add(int a, int b)
	{
		System.out.println(a+b);
	}
	
	public int sqaure(int a)
	{
		int sq = a*a;
		return sq;
	}
	
	public String getMessage()
	{
		return "hello";
	}
	
	public void addArray(int sahil[])
	{
		int sum =0;
		for (int i = 0; i < sahil.length; i++) {
			sum += sahil[i];
		}
		System.out.println("Sum of an array is : "+sum);
	}
	
	public int[] revArray(int a[])
	{
		int b[] = new int[a.length];
		int c = 0;
		for(int i=a.length-1;i>=0;i--)
		{
			b[c] = a[i];
			c++;
		}
		return b;
	}
	
	
	public void varArgs(int...a)
	{
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
	
}

public class O003_MethodManipulation {
	
	
	public static void main(String[] args) {
		
		
		Calc c = new Calc();
		c.print();
		c.printName("hello");
		c.add(10, 20);
		int sq =  c.sqaure(10);
		System.out.println(sq);
		System.out.println(c.sqaure(5));
		System.out.println(c.getMessage());
		
		int a[] = {10,20,30,40,50};
		c.addArray(a);
		int b[] = {1,2,3,4,5};
		c.addArray(b);
		System.out.println("*****************");
		
		int k[] =  c.revArray(b);
		for (int i = 0; i < k.length; i++) {
			System.out.println(k[i]);
		}
		
		System.out.println("**********");
		
		c.varArgs(10,20,30,40,50,60,70);
		
	}
}
