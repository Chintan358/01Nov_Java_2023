package com.service;

import java.util.ArrayList;



import com.model.Student;

public interface StudentService {
	
	public void addOrUpdateData(Student st);
	public ArrayList<Student> viewAllData();
	public void deleteData(int id);
	public Student getById(int id);
}
