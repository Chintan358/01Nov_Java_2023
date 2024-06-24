package com.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;

import com.dao.EmpDao;
import com.model.Emp;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

@WebServlet("/reg")
@MultipartConfig
public class Regcontroller extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String pass = req.getParameter("pass");
		Part file = req.getPart("file");
		String filename = Paths.get(file.getSubmittedFileName()).getFileName().toString();
		
		
		String basePath = req.getServletContext().getRealPath("")+File.separator+"img";
		File f = new File(basePath);
		if(!f.exists())
		{
			f.mkdir();
		}
		System.out.println(basePath);
		file.write(basePath+File.separator+filename);
		
		Emp e = new Emp();
		e.setName(name);
		e.setEmail(email);
		e.setPass(pass);
		e.setImage(filename);
		
		EmpDao dao = new EmpDao();
		dao.addOrUpdate(e);
		
		req.setAttribute("msg", "Registration success");
		req.getRequestDispatcher("index.jsp").forward(req, resp);
		
		
		
		
		
	}
	

}
