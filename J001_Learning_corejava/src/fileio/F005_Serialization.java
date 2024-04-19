package fileio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class F005_Serialization {
	public static void main(String[] args) {
		
		
		Student st = new Student();
		
		
		try {
			
			FileOutputStream fis = new FileOutputStream("C:\\Chintan_work\\Files\\data.ser");
			ObjectOutputStream obj = new ObjectOutputStream(fis);
			
			obj.writeObject(st);
		
		
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
