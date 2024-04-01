package com;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/forgotpass")
public class ForgotPassword extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String email = req.getParameter("email");
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava","root","");
			PreparedStatement ps  =cn.prepareStatement("select * from reg where email=?");
			ps.setString(1, email);
			
			
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				Random r = new Random();
				int num =  r.nextInt(1000, 9999);
				
				ServletContext cx = req.getServletContext();
				cx.setAttribute("myotp", num+"");
				cx.setAttribute("email",email);
				
				Mailer.send(email, "OTP Verification", "Your otp for registation is : "+num);
				
				req.getRequestDispatcher("otpverify.jsp").forward(req, resp);
			
				
			}
			else
			{
				req.setAttribute("err", "User not found !!!");
				req.getRequestDispatcher("forgotpass.jsp").forward(req, resp);
			}
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
}
