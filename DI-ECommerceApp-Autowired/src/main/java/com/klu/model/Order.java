package com.klu.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class Order {
	private int orderId;
	private String customerName;
	private int quantity;
	@Autowired
	private Product p;
	
	public Order() {
		this.orderId=2005;
		this.customerName="Bharath";
		this.quantity=3;
	}
	
	public void display() {
		System.out.println("The following are the order details: ");
		System.out.println("----------------------------------");
		System.out.println("Order Id: "+orderId);
		System.out.println("Customer Name: "+customerName);
		System.out.println("Quantity: "+quantity);
		System.out.println("Product Id:"+p.getProdctId());
		System.out.println("Product Name: "+p.getProductName());
		System.out.println("Product Price: "+p.getPrice());
		System.out.println("Product Category: "+p.getCategory());
	}
	
}
