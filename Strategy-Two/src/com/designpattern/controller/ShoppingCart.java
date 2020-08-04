package com.designpattern.controller;

import java.util.ArrayList;
import java.util.List;

import com.designpattern.model.Product;

public class ShoppingCart {
	
	private List<Product> productList;

	public ShoppingCart() {
		this.productList = new ArrayList<>();
	}
	
	public void addProduct(Product product) {
		this.productList.add(product);
	}
	
	public void removeProduct(Product product) {
		this.productList.remove(product);
	}
	
	public int calculateTotal() {
		return this.productList.stream().map(Product::getPrice).reduce(0, Integer::sum);
	}
	
	public void pay(Payment paymentStrategy) {
		int amount = calculateTotal();
		paymentStrategy.pay(amount);
	}
}
