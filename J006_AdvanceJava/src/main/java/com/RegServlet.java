package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/reg")
public class RegServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String uname = req.getParameter("uname");
		String email = req.getParameter("email");
		String pass = req.getParameter("pass");
		String phone = req.getParameter("phone");
		
		System.out.println(uname+" "+email+" "+pass+" "+phone);
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava","root","");
		
			PreparedStatement ps = cn.prepareStatement("insert into reg values(?,?,?,?,?)");
			ps.setInt(1, 0);
			ps.setString(2, uname);
			ps.setString(3, email);
			ps.setString(4, pass);
			ps.setString(5, phone);
			
			int i = ps.executeUpdate();
			
			if(i>0)
			{
				//PrintWriter pw = resp.getWriter();
				//pw.write("<h1>Registration success !!!</h1>");
				req.setAttribute("msg", "Registration success !!!");
				req.getRequestDispatcher("reg.jsp").forward(req, resp);
				//req.getRequestDispatcher("reg.html").include(req, resp);
				//resp.sendRedirect("reg.html");
			}
		
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
