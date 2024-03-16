package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.demo.Category;

@Service
public interface CategoryService 
{
   
	//save category
	
	Category saveCategory(Category category);
			
	//Get All category
	List <Category> getAllCategory();
	
	//Update By Id
	
	Category updateCategory(Category category, Integer cat_id);
	
	//Delete category By Id
	void deleteCategoryById(Integer cat_id);
			
	//get by Id
	Optional<Category> findById(Integer cat_id);
			
	
}
