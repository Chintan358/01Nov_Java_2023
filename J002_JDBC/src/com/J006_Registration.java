package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class J006_Registration {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter username : ");
		String uname = sc.next();
		System.out.println("enter password");
		String pass = sc.next();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/01nov","root","");
			
			PreparedStatement ps  =cn.prepareStatement("insert into reg values(?,?,?)");
			ps.setInt(1, 0);
			ps.setString(2, uname);
			ps.setString(3, pass);
			
			int i = ps.executeUpdate();
			
			if(i>0)
			{
				System.out.println("Registration successful !!!");
			}
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
