package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class J005_deleteEmp {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter id : ");
		int id = sc.nextInt();
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/01nov","root","");
			
			Statement st = cn.createStatement();
			
			int i = st.executeUpdate("delete from emp where id="+id+"");
			
			if(i>0)
			{
				System.out.println("data deleted...!!!");
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
