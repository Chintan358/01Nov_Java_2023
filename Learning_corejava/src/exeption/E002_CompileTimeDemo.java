package exeption;

public class E002_CompileTimeDemo {
	public static void main(String[] args) {
		
		try {
			Class.forName("exeption.Demo");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
