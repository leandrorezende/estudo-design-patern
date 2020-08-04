package com.designpatterns.model;

public class JamaicaCheeseBurguer extends Hamburguer {
	public JamaicaCheeseBurguer() {
		name = "Jamaican Style Cheese Burguer";
		sauce = "Spicy jamaican sauce";
		buns = "Cookie dough buns";
	}
	
	@Override
	public void cook() {
		System.out.println("Cooking Jamaica style ....");
	}
}
