package fileio;

import java.io.File;
import java.io.IOException;

public class F004_file {
	public static void main(String[] args) {
		
		
		File file = new File("C:\\Chintan_work\\Files\\home");
		
		file.mkdir();
		
		//System.out.println(file.isFile());
		//System.out.println(file.isDirectory());
		
//		if(file.exists())
//		{
//			System.out.println("exist");
//			file.delete();
//		}
//		else
//		{
//			System.out.println("not found...");
//			try {
//				file.createNewFile();
//				System.out.println("file created...");
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		
		
	}
}
