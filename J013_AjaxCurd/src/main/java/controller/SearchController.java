package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import com.google.gson.Gson;

import dao.EmployeeDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Employee;

@WebServlet("/search")
public class SearchController extends HttpServlet {
	
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
			String value = req.getParameter("value");
			
			EmployeeDao dao = new EmployeeDao();
			ArrayList<Employee> emp = dao.searchEmp(value);
			
			PrintWriter pw  =resp.getWriter();
			Gson json = new Gson();
			String data =  json.toJson(emp);
			
			pw.append(data);
			
		}
}
