package oops;
class P
{
	P()
	{
		System.out.println("Running P class cons....");
	}
}

class Q extends P
{
	Q()
	{
		this("Mayank");
		System.out.println("Running Q class cons....");
	}
	
	Q(String name)
	{
		System.out.println("My name is :"+name);
	}
}


class R extends Q
{
	R()
	{
		super();
		System.out.println("Running R class cons....");
	}
}

public class O008_ConstructorChaining {
	public static void main(String[] args) {
		
		R r = new R();
		
	}
}
