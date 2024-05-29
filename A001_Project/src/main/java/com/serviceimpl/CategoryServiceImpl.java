package com.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.CategoryDao;
import com.model.Category;
import com.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	CategoryDao categoryDao;
	
	@Override
	public void addorUpdateCategory(Category c) {
		// TODO Auto-generated method stub
		categoryDao.addorUpdateCategory(c);
	}

	@Override
	public List<Category> viewallcategory() {
		// TODO Auto-generated method stub
		return categoryDao.viewallcategory();
	}

	@Override
	public void deleteCategory(int id) {
		categoryDao.deleteCategory(id);

	}

	@Override
	public Category catgorybyId(int id) {
		// TODO Auto-generated method stub
		return categoryDao.catgorybyId(id);
	}

}
