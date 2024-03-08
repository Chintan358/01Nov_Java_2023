package oops;

interface Itr1 
{
	public static final int i = 50;
	public void display();
}

interface Itr2 extends Itr1
{
	public void run();
}

class Demo1
{
	public void run()
	{
		
	}
}

class InterImpl extends Demo1 implements Itr1,Itr2
{

	@Override
	public void display() {
		System.out.println("runing display");
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	
}

public class O014_InterfaceDemo {
	public static void main(String[] args) {
		
	}
}
