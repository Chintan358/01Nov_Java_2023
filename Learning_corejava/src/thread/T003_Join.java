package thread;

class Demo1 extends Thread
{
	public void run()
	{
		for(int i=1;i<=3;i++)
		{
			System.out.println(currentThread().getName()+" : "+i);
		}
	}
}

public class T003_Join {
	public static void main(String[] args) {
		
		
		Demo1 d1 = new Demo1();
		
		Thread t1 = new Thread(d1);
		Thread t2 = new Thread(d1);
		Thread t3 = new Thread(d1);
	
		t2.start();
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t1.start();
		t3.start();
		
		
		
	}
}
