package controller;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

import dao.UserDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.UserAjax;

@WebServlet("/update")
public class UpdateController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		int id = Integer.parseInt(req.getParameter("id"));
		String action = req.getParameter("action");
		
		UserDao dao = new UserDao();
		PrintWriter pw  =resp.getWriter();
		Gson json = new Gson();
		if(action.equals("edit"))
		{
			UserAjax u = dao.UsrById(id);
			System.out.println(u.getId());
			String mapper = new ObjectMapper().writeValueAsString(u);
			pw.append(mapper);
		}
		else if(action.equals("delete"))
		{
			dao.deleteUser(id);
			pw.append("User deleted !!!");
		}
		
		
		
		
	
		
		
		
		
		
		
		
		
	}
}
