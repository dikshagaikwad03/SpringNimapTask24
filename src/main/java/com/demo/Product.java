package com.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "products")
public class Product 
{
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)

	//private data members
	private Integer prod_id;
	private String prod_name;
	private String prod_price;
	
	public Integer getProd_id() {
		return prod_id;
	}
	public void setProd_id(Integer prod_id) {
		this.prod_id = prod_id;
	}
	public String getProd_name() {
		return prod_name;
	}
	public void setProd_name(String prod_name) {
		this.prod_name = prod_name;
	}
	public String getProd_price() {
		return prod_price;
	}
	public void setProd_price(String prod_price) {
		this.prod_price = prod_price;
	}
	
	public Product(String prod_name, String prod_price) {
		super();
		this.prod_name = prod_name;
		this.prod_price = prod_price;
	}
	
	@Override
	public String toString() 
	{
		return "Product [prod_id=" + prod_id + ", prod_name =" + prod_name + ", prod_price="+ prod_price + "]";
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

}
