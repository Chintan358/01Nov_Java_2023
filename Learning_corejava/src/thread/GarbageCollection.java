package thread;

class Sample
{
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Gc Called");
	}
}

public class GarbageCollection {
	public static void main(String[] args) {
		
		Sample s1 = new Sample();
		Sample s2 = new Sample();
		//1 : annonamys object
		new Sample();
		//2 null object
		s1 = null;
		//3 reassining to refrence
		s2 = s1;
		
		System.gc();
	}
}
