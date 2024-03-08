package assement;

import java.util.Scanner;

public class LibraryMgnt {
	public static void main(String[] args) {

		LibraryOpration op = new LibraryOpration();
		
		while(true)
		{
		boolean b = op.loginCheck();
		Scanner sc = new Scanner(System.in);
		if (b) {
			int choice = 0;
			do {
				System.out.println("**********Main Menu***********");
				System.out.println("1 : Add Book");
				System.out.println("2 : Delete Book");
				System.out.println("3 : Search Book");
				System.out.println("4 : View Book List");
				System.out.println("5 : Edit book recore");
				System.out.println("6 : change password");
				System.out.println("7 : Exit from application");

				choice = sc.nextInt();
				switch (choice) {
				case 1 : op.addBook();
				break;
				case 2 : op.viewBook();
				break;
				case 3 : op.changePass();
				break;
				}

			} while (choice != 7);
		} else {
			System.out.println("Invalid credentials");
		}
		}

	}
}
