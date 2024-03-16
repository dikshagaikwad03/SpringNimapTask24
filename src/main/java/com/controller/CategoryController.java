package com.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.Category;
import com.service.CategoryService;

@RestController
@RequestMapping("/api")
public class CategoryController 
{
	@Autowired
	private CategoryService categoryService;

	// Save operation
	@PostMapping("/categories")
	public Category saveCategory(@Validated @RequestBody Category category) 
	{
		return categoryService.saveCategory(category);
	}  

	// Read operation
	@GetMapping("/categories")
	public List<Category> getAllCategory() 
	{
		return categoryService.getAllCategory();
	}

	// Update operation
	@PutMapping("/categories/{cat_id}")
	public Category updateProduct(@RequestBody Category category, @PathVariable("cat_id") Integer cat_id)
	{
		return categoryService .updateCategory(category, cat_id);
	}

	// Delete operation
	@DeleteMapping("/categories/{cat_id}")
	public String delectProductById(@PathVariable("cat_id") Integer cat_id) 
	{
		categoryService.deleteCategoryById(cat_id);
		return "Deleted Successfully";
	}
			
	// Update operation
	@GetMapping("/categories/{cat_id}")
	public Optional<Category> findById(@PathVariable("cat_id") Integer cat_id) 
	{
		return categoryService.findById(cat_id);
	}

}
