package Controller;

import java.io.IOException;

import dao.UserDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.User;

@WebServlet("/reg")
public class regController extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String uname = req.getParameter("uname");
		String email = req.getParameter("email");
		String pass = req.getParameter("pass");

		User u = new User();
		u.setUname(uname);
		u.setEmail(email);
		u.setPass(pass);

		UserDao dao = new UserDao();

		int i = dao.registration(u);

		if (i > 0) {

			req.setAttribute("msg", "registration successfully");
			req.getRequestDispatcher("reg").forward(req, resp);
		}

	}

}
