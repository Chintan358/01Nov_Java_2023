package impclasses;

public class I002_StringMEthods {
	public static void main(String[] args) {
		
		String s = "Sun rises in east";
		
		System.out.println("Length : "+s.length());
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.charAt(5));
		System.out.println(s.indexOf("i"));
		System.out.println(s.lastIndexOf("i"));
		System.out.println(s.startsWith("s"));
		System.out.println(s.endsWith("st"));
		System.out.println(s.replace("u", "A"));
		System.out.println(s.substring(5));
		System.out.println(s.substring(5,11));
		System.out.println(s.trim());
		
		System.out.println("*******************");
		
		String str[] =  s.split(" ");
		
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
		
		System.out.println("********************");
		
		char ch[] = s.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}
		
		System.out.println("*********************");
		
		byte b[] = s.getBytes();
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		
		System.out.println("************");
		String i = "Hello";
		String j = "hello";
		
		System.out.println(i.equals(j));
		System.out.println(i.equalsIgnoreCase(j));
				
	}
}
