package assignment;

class Complex
{
	int real, img;
	public Complex(int real, int img) {
		this.real = real;
		this.img = img;
	}
	
	public void print()
	{
		System.out.println(real+" + i"+img);
	}
	
	public static Complex add(Complex c1, Complex c2)
	{
		Complex c = new Complex(0,0);
		c.img = c1.img+c2.img;
		c.real = c1.real+c2.real;
		
		return c;
	}
	
	
	
}

public class A28 {
	
	
	
	public static void main(String[] args) {
		
		
		Complex c1 = new Complex(10, 20);
		Complex c2 = new Complex(1, 5);
		
		c1.print();
		c2.print();
			
		Complex k =  Complex.add(c1, c2);	
		k.print();
	}
}
