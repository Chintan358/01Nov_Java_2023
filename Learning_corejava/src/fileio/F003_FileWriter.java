package fileio;

import java.io.FileWriter;
import java.io.IOException;

public class F003_FileWriter {
	
	public static void main(String[] args) {
		
		FileWriter fw = null;
		
		try {
			fw = new FileWriter("C:\\Chintan_work\\Files\\test.txt");
			String str = "This is file writer program";
			fw.write(str);
			fw.flush();
			System.out.println("Done");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
}
