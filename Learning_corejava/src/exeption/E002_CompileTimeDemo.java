package exeption;

class Abc
{
	public void run() throws ClassNotFoundException
	{
			Class.forName("exeption.Demo1");
	}
}

public class E002_CompileTimeDemo {
	
	public static void main(String[] args) {
		
		Abc a = new Abc();
		try {
			a.run();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
