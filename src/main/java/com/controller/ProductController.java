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

import com.demo.Product;
import com.service.ProductService;

@RestController
@RequestMapping("/api")
public class ProductController
{

	@Autowired
	private ProductService productService;

	// Save operation
	@PostMapping("/products")
	public Product saveProduct(@Validated @RequestBody Product product) {
		return productService.saveProduct(product);
	}

	// Read operation
	@GetMapping("/products")
	public List<Product> getAllProduct() {
		return productService.getAllProduct();
	}

	// Update operation
	@PutMapping("/products/{prod_id}")
	public Product updateProduct(@RequestBody Product product, @PathVariable("prod_id") Integer prod_id) {
		return productService.updateProduct(product, prod_id);
	}

	// Delete operation
	@DeleteMapping("/products/{prod_id}")
	public String delectProductById(@PathVariable("prod_id") Integer prod_id) {
		productService.delectProductById(prod_id);
		return "Deleted Successfully";
	}
	
	// Update operation
	@GetMapping("/products/{prod_id}")
		public Optional<Product> findById(@PathVariable("prod_id") Integer prod_id) {
			return productService.findById(prod_id);
		}
}
