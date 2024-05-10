package com.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.StudentDao;
import com.model.Student;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentDao studentDao;
	
	@Override
	public void addOrUpdateData(Student st) {
		studentDao.addOrUpdateData(st);
	}

	@Override
	public ArrayList<Student> viewAllData() {
		// TODO Auto-generated method stub
		return studentDao.viewAllData();
	}

	@Override
	public void deleteData(int id) {
		// TODO Auto-generated method stub
		studentDao.deleteData(id);
	}

	@Override
	public Student getById(int id) {
		// TODO Auto-generated method stub
		return studentDao.getById(id);
	}

}
