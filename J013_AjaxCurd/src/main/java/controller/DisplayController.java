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

@WebServlet("/display")
public class DisplayController extends HttpServlet {
	
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
			EmployeeDao dao = new EmployeeDao();
			ArrayList<Employee> emp = dao.getAllEmp();
			
			PrintWriter pw  =resp.getWriter();
			Gson json = new Gson();
			String data =  json.toJson(emp);
			
			pw.append(data);
			
		}
}
