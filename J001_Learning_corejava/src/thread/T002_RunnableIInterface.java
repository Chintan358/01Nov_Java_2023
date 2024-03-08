package thread;

class Basic
{
	
}

class T1 extends Basic implements Runnable
{

	@Override
	public void run() {
		System.out.println("running run");
		
	}
	
}

public class T002_RunnableIInterface {
	public static void main(String[] args) {
		
		
		T1 t = new T1();
		
		Thread th1 = new Thread(t);
		th1.start();
		
		
	}
}
