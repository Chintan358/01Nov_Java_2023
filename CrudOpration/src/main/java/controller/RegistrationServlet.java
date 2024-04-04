package controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;

import dao.UserDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;
import model.User;

@WebServlet("/reg")
@MultipartConfig
public class RegistrationServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String uname = req.getParameter("uname");
		String email = req.getParameter("email");
		String pass = req.getParameter("pass");
		String gender = req.getParameter("gender");
		String lang[] = req.getParameterValues("lang");
		String country = req.getParameter("country");
		Part img = req.getPart("img");
		
		String langs = "";
		for(int i=0;i<lang.length;i++)
		{
			langs+=lang[i]+",";
		}
		
		String filename = Paths.get(img.getSubmittedFileName()).getFileName().toString();
		
		String path = req.getServletContext().getRealPath("")+File.separator+"img";
		System.out.println(path);
		File f = new File(path);
		
		if(!f.exists())
		{
			f.mkdir();
		}
		
		img.write(path+File.separator+filename);
		
		User u = new User();
		u.setUname(uname);
		u.setEmail(email);
		u.setPass(pass);
		u.setGender(gender);
		u.setLang(langs);
		u.setCountry(country);
		u.setImg(filename);
		
		UserDao dao = new UserDao();
		int i = dao.addUser(u);
		
		if(i>0)
		{
			req.getRequestDispatcher("index.jsp").forward(req, resp);
			
		}
		
		
		
	}
}
