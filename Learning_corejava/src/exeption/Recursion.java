package exeption;

class Run
{
	public void square(int i)
	{
		System.out.println(i*i);
		i++;
		if(i<15)
		{
		square(i);
		}
	}
}

public class Recursion {
	public static void main(String[] args) {
		
		Run r =new Run();
		r.square(1);
		
	}
}
