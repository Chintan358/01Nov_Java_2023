package thread;

class Table
{
	
	public synchronized void print(int num)
	{
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(num*i);
		}
		
	}
}

class PrintTable1 extends Thread
{
	Table t;
	public PrintTable1(Table t) {
		this.t = t;
	}
	public void run()
	{
		t.print(5);
	}
}

class PrintTable2 extends Thread
{
	Table t;
	public PrintTable2(Table t) {
		this.t = t;
	}
	public void run()
	{
		t.print(7);
	}
}

public class T004_MethodSync {
	public static void main(String[] args) {
		
		Table t1 = new Table();
		
		PrintTable1 pt1 = new PrintTable1(t1);
		PrintTable2 pt2 = new PrintTable2(t1);
		
		pt1.start();
		pt2.start();
		
	}
}
