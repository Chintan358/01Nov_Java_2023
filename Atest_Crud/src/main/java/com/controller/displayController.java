package com.controller;

import java.io.IOException;

import com.dao.EmpDao;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/display")
public class displayController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		EmpDao dao = new EmpDao();
		req.setAttribute("data", dao.viewAllemp());
		req.getRequestDispatcher("display.jsp").forward(req, resp);
		
	}
}
