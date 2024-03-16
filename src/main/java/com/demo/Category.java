package com.demo;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "category")
public class Category
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	//private data members
	private Integer cat_id;
	private String cat_name;
	
	//Constructor
	public Category() {
		super();
	}

	//Parameterized Constructor
	public Category(String cat_name, List<Product> products) { 
		super();
		this.cat_name = cat_name;
		this.products = products;
	}
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "cat_id", referencedColumnName = "cat_id")
	List <Product> products = new ArrayList<>();
	
	public List<Product> getProducts() {
		return products;
	}
	
	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public Integer getCat_id() {
		return cat_id;
	}
	public void setCat_id(Integer cat_id) {
		this.cat_id = cat_id;
	}
	public String getCat_name() {
		return cat_name;
	}
	public void setCat_name(String cat_name) {
		this.cat_name = cat_name;
	}
	
	@Override
	public String toString() {
		return "Category [cat_id=" + cat_id + ", cat_name=" + cat_name + "]";
	}
}	
	
