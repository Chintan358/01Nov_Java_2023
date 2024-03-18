package com;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/data")
public class Data extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String dt = req.getParameter("val");
		
		
		PrintWriter pw = resp.getWriter();
		
		if(dt.equals("electric"))
		{
			pw.append("<ul><li>Fan</li><li>TV</li><li>Phone</li></ul>");
		}
		else if(dt.equals("cloths"))
		{
			pw.append("<ul><li>Shirt</li><li>t-Shirt</li><li>Cap</li></ul>");
		}
		else if(dt.equals("sports"))
		{
			pw.append("<ul><li>Bat</li><li>Ball</li><li>Hockystick</li></ul>");
		}
	}
}
