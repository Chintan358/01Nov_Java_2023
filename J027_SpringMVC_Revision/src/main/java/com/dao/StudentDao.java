package com.dao;

import java.util.ArrayList;

import com.model.Student;

public interface StudentDao {
	
	public void addOrUpdateData(Student st);
	public ArrayList<Student> viewAllData();
	public void deleteData(int id);
	public Student getById(int id);
}
