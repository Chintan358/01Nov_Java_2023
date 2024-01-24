package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class J001_JDBCconnection {
	public static void main(String[] args) {
		
		
		
	
		try {
			
			//1 : Load driver
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded...");
			
			//2 : define connection url
			String url  = "jdbc:mysql://localhost:3306/01nov";
			String user = "root";
			String pass = "";
			
			//3 : established connection
			Connection cn = DriverManager.getConnection(url,user,pass);
			System.out.println("connection established");
			
			//4 :create statement
			Statement st = cn.createStatement();
			
			//5 : execute query
			ResultSet rs =  st.executeQuery("select * from emp");
			
			//6 : process resultset
			while(rs.next())
			{
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String email=rs.getString("email");
				String dept = rs.getString(4);
				double sal = rs.getDouble(5);
				
				System.out.println(id+" "+name+" "+email+" "+dept+" "+sal);
			}
			
			//7 :close the connection
			cn.close();
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
