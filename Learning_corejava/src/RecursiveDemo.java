
class Calc
{
	public void square(int num)
	{
		System.out.println(num*num);
		num++;
		if(num<25)
		{
			square(num);
		}
	}
}

public class RecursiveDemo {
	public static void main(String[] args) {
		
		Calc c = new Calc();
		c.square(10);
		
	}
}
