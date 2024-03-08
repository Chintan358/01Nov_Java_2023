package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class J007_Login {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter username : ");
		String uname = sc.next();
		System.out.println("enter password");
		String pass = sc.next();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/01nov","root","");
			
			PreparedStatement ps  =cn.prepareStatement("select * from reg where uname=? and pass=?");
			ps.setString(1, uname);
			ps.setString(2, pass);
			
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				System.out.println("Welcome : "+rs.getString(2));
			}
			else
			{
				System.out.println("Invalid credentials");
			}
			
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
