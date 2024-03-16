package com.service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.Product;
import com.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService
{
	@Autowired
	private ProductRepository productRepository;

	@Override
	public Product saveProduct(Product product) {
		return productRepository.save(product);
	}

	@Override
	public List<Product> getAllProduct() {
		return (List<Product>) productRepository.findAll();

	}

	@Override
	public Product updateProduct(Product product, Integer prod_id) {
		Product prod = productRepository.findById(prod_id).get();

		if (Objects.nonNull(product.getProd_name()) && !"".equalsIgnoreCase(product.getProd_name())) {
			prod.setProd_name(product.getProd_name());
		}

		if (Objects.nonNull(product.getProd_price()) && !"".equalsIgnoreCase(product.getProd_price())) {
			prod.setProd_price(product.getProd_price());
		}

		return productRepository.save(prod);
	}

	@Override
	public void delectProductById(Integer prod_id) {
		productRepository.deleteById(prod_id);
	}

	@Override
	public Optional<Product> findById(Integer prod_id) {
		return productRepository.findById(prod_id);
	}
	
}
