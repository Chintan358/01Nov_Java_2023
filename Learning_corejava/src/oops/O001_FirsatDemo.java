package oops;

class Pen
{
	//data member
	int price;
	static String color;
	String company;
	
	//function member
	public void toWrite()
	{
		
		System.out.println(price+" "+color+" "+company);
	}
	
	public static void display()
	{
		
	}
	
}

public class O001_FirsatDemo {
	
	public static void main(String[] args) {
		
		Pen.color="Red";
		Pen.display();
		
		Pen p1 = new Pen();
		p1.price=50;
		//p1.color="Green";
		p1.company="cello";
		p1.toWrite();
		
		Pen p2 = new Pen();
		p2.price=80;
		//p2.color="red";
		p2.toWrite();
	}
}
