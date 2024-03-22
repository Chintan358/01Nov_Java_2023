package controller;

import java.io.IOException;
import java.io.PrintWriter;

import com.google.gson.Gson;

import dao.EmployeeDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Employee;

@WebServlet("/update")
public class UpdateController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter pw  =resp.getWriter();
		String action = req.getParameter("action");
		int uid = Integer.parseInt(req.getParameter("uid"));
		EmployeeDao dao = new EmployeeDao();
		if(action.equals("edit"))
		{
			
			Employee e =  dao.getEmpById(uid);
			Gson json = new Gson();
			
			pw.append(json.toJson(e));
			
		}
		else if(action.equals("delete"))
		{
			int i = dao.deleteEmp(uid);
			
			if(i>0)
			{
				
				pw.append("daata deleted !!!!");
			}
		}
	}
	
	
	
}
