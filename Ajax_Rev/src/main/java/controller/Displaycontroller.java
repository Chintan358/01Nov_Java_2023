package controller;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import com.google.gson.Gson;

import dao.UserDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.UserAjax;

@WebServlet("/display")
public class Displaycontroller extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		
		UserDao dao = new UserDao();
		ArrayList<UserAjax> ul =  (ArrayList<UserAjax>) dao.allUser();
		
		Gson json = new Gson();
		
		PrintWriter pw  =resp.getWriter();
		pw.append(json.toJson(ul));
		
		
		
		
		
		
		
		
		
	}
}
