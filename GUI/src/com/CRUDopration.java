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
import java.sql.SQLException;

import javax.swing.SpringLayout;


import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;

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
	}

	Connection cn = null;
	private JTable table;
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
				
				String uname1 = uname.getText();
				String email1 = email.getText();
				String pass1 = pass.getText();
				
				try {
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
		
		table = new JTable();
		table.setBounds(351, 48, 271, 209);
		frame.getContentPane().add(table);
	}
}
