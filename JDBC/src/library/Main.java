package library;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		int choice=0;
		do
		{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Choice : ");
		System.out.println("0 : Exit");
		System.out.println("1 : add book");
		System.out.println("2 : View Book");
		System.out.println("3 : Delete Book");
		System.out.println("4 : Issue Book");
		choice= sc.nextInt();
		
		BookOpration book = new BookOpration();
		switch (choice) {
		case 0 : System.out.println("exit");
		break;
		case 1 :book.addBook();
		break;
		case 2 :book.viewBook();
		break;
		case 3 : book.deleteBook();
		break;
		case 4 :book.issueBook();
		break;
		default:
			System.out.println("Invalid choice");
		}
		}while(choice!=0);
		
		
		
	}
}
