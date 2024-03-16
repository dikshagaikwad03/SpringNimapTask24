package com.service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.Category;
import com.repository.CategoryRepository;

@Service
public class CategoryServiceImpl implements CategoryService
{
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Override
	public Category saveCategory(Category category) {
		// TODO Auto-generated method stub
		return categoryRepository.save(category);
	}

	@Override
	public List<Category> getAllCategory() {
		// TODO Auto-generated method stub
		return (List<Category>) categoryRepository.findAll();
	}

	@Override
	public Category updateCategory(Category category, Integer cat_id) {
		// TODO Auto-generated method stub
		Category cat = categoryRepository.findById(cat_id).get();

		if (Objects.nonNull(category.getCat_name()) && !"".equalsIgnoreCase(category.getCat_name())) {
			cat.setCat_name(category.getCat_name());
		}

		return categoryRepository.save(cat);
	}

	@Override
	public void deleteCategoryById(Integer cat_id) {
		// TODO Auto-generated method stub
		categoryRepository.deleteById(cat_id);
		
	}

	@Override
	public Optional<Category> findById(Integer cat_id) {
		// TODO Auto-generated method stub
		return categoryRepository.findById(cat_id);
	}
}
