package oops;

class Run
{
	static int count = 0;
	Run()
	{
		count++;
		
	}
}

public class O005_ObjectCount {
	public static void main(String[] args) {
		
		Run r1 = new Run();
		Run r2 = new Run();
		Run r3 = new Run();
		Run r4 = new Run();
		
		System.out.println(Run.count);
	}
}
