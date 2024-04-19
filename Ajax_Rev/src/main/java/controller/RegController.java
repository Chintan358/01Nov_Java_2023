package controller;

import java.io.IOException;
import java.io.PrintWriter;

import dao.UserDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.UserAjax;

@WebServlet("/reg")
public class RegController extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		UserAjax user = new UserAjax();
		user.setUname(req.getParameter("uname"));
		user.setEmail(req.getParameter("email"));
		user.setPhone(req.getParameter("phone"));
		user.setPass(req.getParameter("pass"));
		
		UserDao dao = new UserDao();
		dao.addorUpdateUSer(user);
		
		PrintWriter pw  =resp.getWriter();
		pw.append("User Inserted...");
		
		
		
		
		
		
		
		
		
	}
}
