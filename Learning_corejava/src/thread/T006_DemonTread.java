package thread;

class Thd extends Thread
{
	@Override
	public void run() {
		
		if(currentThread().isDaemon())
		{
			System.out.println("Demon");
		}
		else
		{
			System.out.println("Non-Demon");
		}
		
	}
}
public class T006_DemonTread {
	public static void main(String[] args) {
		
		
		Thd t1 = new Thd();
		Thd t2 = new Thd();
		Thd t3 = new Thd();
		
		t1.setDaemon(true);
		t1.start();
		t2.start();
		t3.start();
	}
}
