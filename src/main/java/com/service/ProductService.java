package com.service;

import java.util.List;
import java.util.Optional;

import com.demo.Product;

public interface ProductService {


	//save Product
	
	Product saveProduct(Product product);
	
	//Get All Product

	List<Product> getAllProduct();
	
	//Update By Id
	
	Product updateProduct(Product product, Integer prod_id);
	
	//Delete Product By Id

	void delectProductById(Integer prod_id);
	
	//get by Id
	
	Optional<Product> findById(Integer productId);
	
}
