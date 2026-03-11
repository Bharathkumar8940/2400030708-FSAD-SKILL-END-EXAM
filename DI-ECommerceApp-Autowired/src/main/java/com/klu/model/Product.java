package com.klu.model;

import org.springframework.stereotype.Component;

@Component

public class Product {
	private String productName;
	private int productId;
	private double price;
	private String category;
	
	public Product() {
		this.productId=101;
		this.productName="mobile";
		this.price=354;
		this.category="Electronics";
	}
	public int getProdctId() {
		return productId;
	}
	public String getProductName() {
		return productName;
		
	}
	public double getPrice() {
		return price;
	}
	public String getCategory() {
		return category;
	}
	
	

}
