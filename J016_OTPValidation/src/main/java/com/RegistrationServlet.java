package com;

import java.io.IOException;
import java.util.Random;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/reg")
public class RegistrationServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String uname = req.getParameter("uname");
		String email = req.getParameter("email");
		String pass = req.getParameter("pass");
		
		Random r = new Random();
		int num =  r.nextInt(1000, 9999);
		
		ServletContext cx = req.getServletContext();
		cx.setAttribute("myotp", num+"");
		
		Mailer.send(email, "OTP Verification", "Your otp for registation is : "+num);
		
		req.getRequestDispatcher("otpverify.jsp").forward(req, resp);
		
	}
}
