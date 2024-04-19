package fileio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class F006_Deserialization {
	public static void main(String[] args) {
		
		
	
		
		
		try {
			
			FileInputStream fis = new FileInputStream("C:\\Chintan_work\\Files\\data.ser");
			ObjectInputStream obj = new ObjectInputStream(fis);
			
			 Student st =    (Student) obj.readObject();
			 st.display();
		
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
