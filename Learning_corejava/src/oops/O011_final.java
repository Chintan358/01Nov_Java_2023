package oops;

/*final*/ class FinalDemo
{
	/* final */ public void display()
	{
		
	}
}

class FinalDemo1 extends FinalDemo
{
	@Override
	public void display() {
		
	}
}

public class O011_final {
	public static void main(String[] args) {
		
		final int a = 10;
		//a = 20;
		
		System.out.println(a);
		
		
		
	}
}
