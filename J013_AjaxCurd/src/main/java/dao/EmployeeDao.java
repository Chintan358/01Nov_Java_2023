package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Employee;
import util.CreateConnection;

public class EmployeeDao {

	Connection cn = null;

	public EmployeeDao() {

		cn  = CreateConnection.mkconn();
	}

	public int registration(Employee e) {
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

	public boolean isEmailExist(Employee e) {
		boolean b = false;

		try {
			PreparedStatement ps = cn.prepareStatement("select * from reg where email=?");
			ps.setString(1, e.getEmail());

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
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

			if (rs.next()) {
				uname = rs.getString(2);
			}

		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return uname;
	}

	public ArrayList<Employee> getAllEmp() {

		ArrayList<Employee> emp = new ArrayList<Employee>();
		PreparedStatement ps;
		try {
			ps = cn.prepareStatement("select * from reg");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Employee e = new Employee();
				e.setId(rs.getInt(1));
				e.setUname(rs.getString(2));
				e.setEmail(rs.getString(3));
				e.setPass(rs.getString(4));
				e.setPhone(rs.getString(5));

				emp.add(e);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return emp;
	}

	public int deleteEmp(int uid) {
		
		int i = 0;
		try {
			PreparedStatement ps = cn.prepareStatement("delete from reg where id=?");
			ps.setInt(1, uid);
			
			i = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}

	public Employee getEmpById(int uid) {
		
		Employee e = new Employee();
		try {
			PreparedStatement ps  =cn.prepareStatement("select * from reg where id=?");
			ps.setInt(1, uid);

			ResultSet rs = ps.executeQuery();
			
			if(rs.next())
			{
				e.setId(rs.getInt(1));
				e.setUname(rs.getString(2));
				e.setEmail(rs.getString(3));
				e.setPass(rs.getString(4));
				e.setPhone(rs.getString(5));
			}
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return e;
	}

	public int updateEmp(Employee e) {
		
		int i = 0;
		try {
			PreparedStatement ps = cn.prepareStatement("update reg set uname=?,email=?,pass=?,phone=? where id=?");
			ps.setInt(5, e.getId());
			ps.setString(1, e.getUname());
			ps.setString(2, e.getEmail());
			ps.setString(3, e.getPass());
			ps.setString(4, e.getPhone());

			i = ps.executeUpdate();

		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		return i;
	}

	public ArrayList<Employee> searchEmp(String value) {
		ArrayList<Employee> emp = new ArrayList<Employee>();
		PreparedStatement ps;
		try {
			ps = cn.prepareStatement("select * from reg where uname like ?");
			ps.setString(1, value+"%");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Employee e = new Employee();
				e.setId(rs.getInt(1));
				e.setUname(rs.getString(2));
				e.setEmail(rs.getString(3));
				e.setPass(rs.getString(4));
				e.setPhone(rs.getString(5));

				emp.add(e);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return emp;
	}

	

}
