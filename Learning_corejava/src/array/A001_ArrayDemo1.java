package array;

public class A001_ArrayDemo1 {
	public static void main(String[] args) {
		
		//declaration
		int a[] = new int[5];
		
		//initialization
		a[0] = 10;
		a[1] = 20;
		//a[5] = 56;  exeption
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		System.out.println("*******************");
		
		int b[] = {10,20,30,40,50,60};
		
//		for (int i = 0; i < b.length; i++) {
//			System.out.println(b[i]);
//		}
		
		for(int k : b)
		{
			System.out.println(k);
		}
		
		System.out.println("********************");
		
		String subject[] = {"java","php","android","python"};
		
		for(String s : subject)
		{
			System.out.println(s);
		}
		
		System.out.println("*********************");
		
		char ch[] = {'A','B','C','D'};
		
		for(char c : ch) {
			System.out.println(c);
		}
	}
}
