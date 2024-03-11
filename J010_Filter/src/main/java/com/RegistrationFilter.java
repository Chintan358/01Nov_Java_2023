package com;

import java.io.IOException;

import jakarta.servlet.FilterChain;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebFilter("/reg")
public class RegistrationFilter extends HttpFilter {
	
	@Override
	protected void doFilter(HttpServletRequest req, HttpServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
		
		String uname = req.getParameter("uname");
		String email = req.getParameter("email");
		String pass = req.getParameter("pass");
		String phone = req.getParameter("phone");
		
		RequestDispatcher rd = req.getRequestDispatcher("reg.jsp");
		if(uname.equals("")||uname.equals(null))
		{
			req.setAttribute("unameErr", "Username Required");
			rd.forward(req, resp);
		}
		
		if(email.equals("") || email.equals(null))
		{
			req.setAttribute("emailErr", "Email required");
			rd.forward(req, resp);
		}
		else if(!EmailValidator.emailCheck(email))
		{
			req.setAttribute("emailErr", "Invalid email formate");
			rd.forward(req, resp);
		}
		
		if(pass.equals("") || pass.equals(null))
		{
			req.setAttribute("passErr", "Password required");
			rd.forward(req, resp);
		}
		
		if(phone.equals("") || phone.equals(null))
		{
			req.setAttribute("phoneErr", "Phone required");
			rd.forward(req, resp);
		}
		
		chain.doFilter(req, resp);
		
		
	}
}
