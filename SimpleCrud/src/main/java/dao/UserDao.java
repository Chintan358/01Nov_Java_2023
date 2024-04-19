package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.User;

public class UserDao {

	Connection cn = null;

	public UserDao() {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/arun", "root", "");

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public int registration(User u) {
		int i = 0;

		try {
			PreparedStatement ps = cn.prepareStatement("insert into usera values(?,?,?,?)");
			ps.setInt(1, 0);
			ps.setString(2, u.getUname());
			ps.setString(3, u.getEmail());
			ps.setString(4, u.getPass());

			i = ps.executeUpdate();

			

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return i;
	}
}
