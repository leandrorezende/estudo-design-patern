package com.designpattern;

import com.designpattern.controller.CreditCardAlgorithm;
import com.designpattern.controller.PayPalAlgorithm;
import com.designpattern.controller.ShoppingCart;
import com.designpattern.model.Product;

public class Main {

	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		Product pants = new Product("234", 25);
		Product shirt = new Product("987", 15);
		
		cart.addProduct(pants);
		cart.addProduct(shirt);
		
		cart.pay(new PayPalAlgorithm("leandro.rezende@gmail.com", "1234"));
		cart.pay(new CreditCardAlgorithm("Leandro", "12354567"));
	}
}
