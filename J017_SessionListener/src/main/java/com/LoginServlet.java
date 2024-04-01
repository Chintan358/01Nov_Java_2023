package com;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;



@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String uname = req.getParameter("uname");
		String pass = req.getParameter("pass");
		
		PrintWriter pw = resp.getWriter();
		
		if(uname.equals("admin") && pass.equals("admin"))
		{
			HttpSession session = req.getSession();
			session.setAttribute("uname", uname);
			
			ServletContext cx = req.getServletContext();
			String tuser = (String)cx.getAttribute("tuser");
			String cuser = (String)cx.getAttribute("cuser");
			
			
			pw.print("<h1>Current user : "+cuser+"</h1>");
			pw.print("<h1>Total User : "+tuser+"</h1>");
			
			
			pw.write("<h2><a href='logout'>logout</a></h2>");
			
			
		}
		else
		{
			req.setAttribute("err", "Invalid credentials !!!");
			req.getRequestDispatcher("index.jsp").forward(req, resp);
		}
		
		
	}
}
