package impclasses;

public class I006_WrapperDemo {
	public static void main(String[] args) {
		
		int i = 10;
		
		//boxing
		Integer i1 = new Integer(i);
		//auto boxing
		Integer i2 = i;
		
		Integer j = 54;
		
		//unboxing
		int j1 = j.intValue();
		//auto unboxing
		int j2 = j;
		
		
		int a = 12564;
		Integer b = a;
		int length =  b.toString().length();
		System.out.println(length);
	}
}
