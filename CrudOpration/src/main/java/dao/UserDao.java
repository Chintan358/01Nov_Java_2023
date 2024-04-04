package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.User;

public class UserDao {
		
	Connection cn = null;
	public UserDao() {	
		try {
			Class.forName("com.mysql.jdbc.Driver");
			cn  =DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava","root","");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
	
	public int addUser(User u)
	{
		int i=0;
		
		try {
			PreparedStatement ps  =cn.prepareStatement("insert into user values(?,?,?,?,?,?,?,?)");
			ps.setInt(1, 0);
			ps.setString(2, u.getUname());
			ps.setString(3, u.getEmail());
			ps.setString(4, u.getPass());
			ps.setString(5, u.getGender());
			ps.setString(6, u.getLang());
			ps.setString(7, u.getCountry());
			ps.setString(8, u.getImg());
			
			i = ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return i;
	}
	
	public ArrayList<User> viewUser()
	{
		ArrayList<User> al = new ArrayList();
		
		try {
			PreparedStatement ps = cn.prepareStatement("select * from user");
		
			ResultSet rs  =ps.executeQuery();
			
			while(rs.next())
			{
				User u = new User();
				u.setId(rs.getInt(1));
				u.setUname(rs.getString(2));
				u.setEmail(rs.getString(3));
				u.setPass(rs.getString(4));
				u.setGender(rs.getString(5));
				u.setLang(rs.getString(6));
				u.setCountry(rs.getString(7));
				u.setImg(rs.getString(8));
				
				al.add(u);
				
				
				
				
			}
				
			
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return al;
		
	}


	public User getById(int uid) {
		User u = new User();
		try {
			PreparedStatement ps = cn.prepareStatement("select * from user where id=?");
			ps.setInt(1, uid);
			ResultSet rs  =ps.executeQuery();
			
			while(rs.next())
			{
				
				u.setId(rs.getInt(1));
				u.setUname(rs.getString(2));
				u.setEmail(rs.getString(3));
				u.setPass(rs.getString(4));
				u.setGender(rs.getString(5));
				u.setLang(rs.getString(6));
				u.setCountry(rs.getString(7));
				u.setImg(rs.getString(8));
				
				
				
				
				
			}
				
			
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return u;
		
	}


	public int deleteUser(int uid) {
		
		int i = 0;
		try {
			PreparedStatement ps = cn.prepareStatement("delete from user where id=?");
			ps.setInt(1, uid);
			
			i = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}
	
	
	
}
