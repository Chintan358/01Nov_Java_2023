package impclasses;

public class I001_StringDemo {
	public static void main(String[] args) {
		
		
		//String s = "Welcome1";
		//String s1 =  s.concat("Home");
		//String s1 = new String("Welcome");
		
		//System.out.println(s);
		//System.out.println(s1);
		
		String s1 = new String("Java");
		String s2 = new String("Android");
		String s3 = new String("Java");
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1==s3);
		
		System.out.println("*************");
		
		String str1 = "Java";
		String str2 = "Android";
		String str3 = "Java";
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		System.out.println(str1==str3);
		
	}
}
