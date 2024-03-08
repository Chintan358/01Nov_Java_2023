package com;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class J008_CallbaleDemo2 {
	
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/01nov","root","");
			
			
			CallableStatement cb = cn.prepareCall("{?=call test(?)}");

			cb.registerOutParameter(1, Types.INTEGER);
			
			cb.executeUpdate();
		
			System.out.println(cb.getInt(1));
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
}
