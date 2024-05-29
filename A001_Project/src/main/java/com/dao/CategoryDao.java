package com.dao;

import java.util.List;

import com.model.Category;

public interface CategoryDao {
	
	public void addorUpdateCategory(Category c);
	public List<Category> viewallcategory();
	public void deleteCategory(int id);
	public Category catgorybyId(int id);
}
