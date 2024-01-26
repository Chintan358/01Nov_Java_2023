package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class J002_JDBCconnection {
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/01nov";
			String user = "root";
			String pass = "";
			
			Connection cn = DriverManager.getConnection(url,user,pass);
			
			Statement st = cn.createStatement();
			
			//dql : select
			ResultSet rs =  st.executeQuery("select * from emp");
			
			while(rs.next())
			{
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String email = rs.getString(3);
				String dept = rs.getString(4);
				double sal = rs.getDouble(5);
				
				System.out.println(id+" "+name+" "+email+" "+dept+" "+sal);
			}
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}
}
