package com;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class J008_CallbaleDemo {
	
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/01nov","root","");
			
			
			CallableStatement cb = cn.prepareCall("call addtocrud(?,?,?)");
			cb.setString(1, "tech");
			cb.setString(2, "tech@gmail.com");
			cb.setString(3, "tesch@123");
			
			cb.executeUpdate();
			System.out.println("done");
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
}
