package thread;

class Demo extends Thread
{
	public void run()
	{
		System.out.println(currentThread().getName());
		System.out.println(currentThread().getPriority());
	}
}

public class T002_ThreadPriority {
	public static void main(String[] args) {
		
		
		Demo d1 = new Demo();
		
		Thread t1 = new Thread(d1);
		Thread t2 = new Thread(d1);
		Thread t3 = new Thread(d1);
		
		t1.setPriority(5);
		t2.setPriority(7);
		t3.setPriority(10);
		
		t1.start();
		t2.start();
		t3.start();
		
		
		
	}
}
