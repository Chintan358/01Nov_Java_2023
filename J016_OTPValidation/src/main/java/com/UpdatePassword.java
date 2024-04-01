package com;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/updatepass")
public class UpdatePassword  extends HttpServlet{
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		String pass = req.getParameter("pass");
		
		ServletContext cx = req.getServletContext();
		String email = (String)cx.getAttribute("email");
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava","root","");
			
			PreparedStatement ps = cn.prepareStatement("update reg set pass=? where email=?");
			ps.setString(1, pass);
			ps.setString(2, email);
			
			int i = ps.executeUpdate();
			
			if(i>0)
			{
				req.getRequestDispatcher("home.jsp").forward(req, resp);
			}
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		
		
		
	}

}
