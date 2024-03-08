package assement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class LibraryOpration {
	
	Connection cn=null;
	User u;
	public LibraryOpration() {
		u = new User("admin", "admin");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	Scanner sc = new Scanner(System.in);
	public boolean loginCheck()
	{
		System.out.println("enter username : ");
		String uname = sc.next();
		System.out.println("enter pass : ");
		String pass = sc.next();
		boolean b = false;
		
		if(uname.equals(u.getUname()) && pass.equals(u.getPass()))
		{
			b = true;
		}
		else
		{
			b = false;
		}
		
		
		
//		
//		try {
//			PreparedStatement ps = cn.prepareStatement("select * from user where uname=? and pass=?");
//			ps.setString(1, uname);
//			ps.setString(2, pass);
//			
//			ResultSet rs = ps.executeQuery();
//			if(rs.next())
//			{
//				b = true;
//			}
//			else
//			{
//				b = false;
//			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		return b;
	}
	ArrayList<Book> al;
	public void addBook() {
		
		String categorty = null;
		do {
		System.out.println("********Select Category********");
		System.out.println("1 : Computer");
		System.out.println("2 : Electronics");
		System.out.println("3 : Electrical");
		System.out.println("4 : Civil");
		System.out.println("5 : Mechanical");
		System.out.println("6 : Architecture");
		System.out.println("7 : Back to main menu");
		System.out.println("enter category : ");
		categorty = sc.next();
		if(categorty.equals("7"))
		{
			System.out.println("Back to main menu");
		}
		else
		{ 
			
		System.out.println("Enter id : ");
		int id = sc.nextInt();
		 System.out.println("enter book name");
		 String name = sc.next();
		 System.out.println("enter book author");
		 String author = sc.next();
		 System.out.println("enter qty : ");
		 int qty = sc.nextInt();
		 System.out.println("enter price");
		 double price = sc.nextDouble();
		
		al = new ArrayList<Book>();
		al.add(new Book(id, name, author, qty, price, categorty));
		 System.out.println("Book inserted");
		
//		 try {
//			PreparedStatement ps = cn.prepareStatement("insert into book values(?,?,?,?,?,?)");
//			ps.setInt(1, 0);
//			ps.setString(2, name);
//			ps.setString(3, author);
//			ps.setInt(4, qty);
//			ps.setDouble(5, price);
//			ps.setString(6, categorty);
//			
//			int i = ps.executeUpdate();
//			if(i>0)
//			{
//				System.out.println("book inserted");
//			}
			
//		 } catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		 
		 
		 
		}
		 
		}while(!categorty.equals("7"));
	}
	public void viewBook() {
		
		for(Book b : al)
		{
			System.out.println(b);
		}
		
	}
	public void changePass() {
		
		System.out.println("current pass : "+u.getPass());
		
		System.out.println("enter new pass :");
		String pass = sc.next();
		u.setPass(pass);
		
		System.out.println("new pass : "+u.getPass());
		
	}
	
}
