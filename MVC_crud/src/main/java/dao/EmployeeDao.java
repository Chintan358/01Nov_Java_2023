package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Employee;

public class EmployeeDao {
	
		Connection cn = null;
		public EmployeeDao() {
			
			try {
				Class.forName("com.mysql.jdbc.Driver");
				cn  =DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava","root","");
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		public int registration(Employee e)
		{
			int i = 0;
			try {
				PreparedStatement ps = cn.prepareStatement("insert into reg values(?,?,?,?,?)");
				ps.setInt(1, 0);
				ps.setString(2, e.getUname());
				ps.setString(3, e.getEmail());
				ps.setString(4, e.getPass());
				ps.setString(5, e.getPhone());
				
				i = ps.executeUpdate();
				
				
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			return i;
		}
		
		public boolean isEmailExist(Employee e)
		{
			boolean b = false;
			
			try {
				PreparedStatement ps  =cn.prepareStatement("select * from reg where email=?");
				ps.setString(1, e.getEmail());
				
				ResultSet rs = ps.executeQuery();
				
				if(rs.next())
				{
					b = true;
				}
				
				
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			return b;
		}

		public String logincheck(Employee e) {
			
			String uname = null;
			try {
				PreparedStatement ps = cn.prepareStatement("select * from reg where email=? and pass=?");
				ps.setString(1, e.getEmail());
				ps.setString(2, e.getPass());

				ResultSet rs = ps.executeQuery();
				
				if(rs.next())
				{
					uname = rs.getString(2);
				}
				
				
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			return uname;
		}
		
}
