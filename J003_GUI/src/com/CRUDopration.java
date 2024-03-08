package com;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JSplitPane;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.SpringLayout;

import net.proteanit.sql.DbUtils;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class CRUDopration {

	private JFrame frame;
	private JTextField uname;
	private JTextField email;
	private JTextField pass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CRUDopration window = new CRUDopration();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CRUDopration() {
		initialize();
		connect();
		loaddata();
	}

	Connection cn = null;
	private JTable table;
	private JTextField uid;
	public void connect()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/01nov","root","");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * Initialize the contents of the frame.
	 */
	public void loaddata()
	{
		try {
			PreparedStatement ps  =cn.prepareStatement("select * from crud");
			ResultSet rs = ps.executeQuery();
			table.setModel(DbUtils.resultSetToTableModel(rs));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 661, 415);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Registration Form");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setBounds(265, 11, 153, 32);
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(29, 48, 281, 209);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setBounds(21, 33, 64, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Email");
		lblNewLabel_1_1.setBounds(21, 68, 46, 14);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Password");
		lblNewLabel_1_2.setBounds(21, 102, 46, 14);
		panel.add(lblNewLabel_1_2);
		
		uname = new JTextField();
		uname.setBounds(105, 30, 138, 20);
		panel.add(uname);
		uname.setColumns(10);
		
		email = new JTextField();
		email.setColumns(10);
		email.setBounds(105, 65, 138, 20);
		panel.add(email);
		
		pass = new JTextField();
		pass.setColumns(10);
		pass.setBounds(105, 99, 138, 20);
		panel.add(pass);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String id =uid.getText();
				//System.out.println("id is "+id);
				String uname1 = uname.getText();
				String email1 = email.getText();
				String pass1 = pass.getText();
				
				try {
					if(id.equals(null) || id.equals(""))
					{
					PreparedStatement ps = cn.prepareStatement("insert into crud values(?,?,?,?)");
					ps.setInt(1, 0);
					ps.setString(2, uname1);
					ps.setString(3, email1);
					ps.setString(4, pass1);
					
					int i = ps.executeUpdate();
					if(i>0)
					{
						JOptionPane.showMessageDialog(frame, "Data inserted !!!");
						uname.setText("");
						email.setText("");
						pass.setText("");
						loaddata();
					}
					}
					else
					{
						int uid = Integer.parseInt(id);
						PreparedStatement ps = cn.prepareStatement("update crud set uname=?,email=?,pass=? where id=?");
						ps.setInt(4, uid);
						ps.setString(1, uname1);
						ps.setString(2, email1);
						ps.setString(3, pass1);
						
						int i = ps.executeUpdate();	
						{
							JOptionPane.showMessageDialog(frame, "Data Updated !!!");
							uname.setText("");
							email.setText("");
							pass.setText("");
							CRUDopration.this.uid.setText("");
							loaddata();
						}
					}
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
		});
		btnNewButton.setBounds(105, 130, 64, 23);
		panel.add(btnNewButton);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				uname.setText("");
				email.setText("");
				pass.setText("");
			}
		});
		btnReset.setBounds(179, 130, 64, 23);
		panel.add(btnReset);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(351, 48, 271, 209);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(29, 268, 589, 97);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("User ID\r\n");
		lblNewLabel_2.setBounds(64, 24, 36, 14);
		panel_1.add(lblNewLabel_2);
		
		uid = new JTextField();
		uid.setBounds(40, 46, 86, 20);
		panel_1.add(uid);
		uid.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Edit");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int id =Integer.parseInt(uid.getText());
				try {
					PreparedStatement ps = cn.prepareStatement("select * from crud where id=?");
					ps.setInt(1, id);
					ResultSet rs = ps.executeQuery();
					if(rs.next())
					{
						uname.setText(rs.getString(2));
						email.setText(rs.getString(3));
						pass.setText(rs.getString(4));
					}
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				
			}
		});
		btnNewButton_1.setBounds(221, 24, 89, 44);
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Delete");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int id =Integer.parseInt(uid.getText());
				try {
					PreparedStatement ps = cn.prepareStatement("delete from crud where id=?");
					ps.setInt(1, id);
					int i = ps.executeUpdate();
					if(i>0)
					{
						JOptionPane.showMessageDialog(frame, "Data deleted !!!");
						uid.setText("");
						loaddata();
						
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnNewButton_1_1.setBounds(346, 24, 89, 44);
		panel_1.add(btnNewButton_1_1);
	}
}
