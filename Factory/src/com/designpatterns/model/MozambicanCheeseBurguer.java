package com.designpatterns.model;

public class MozambicanCheeseBurguer extends Hamburguer {
	public MozambicanCheeseBurguer() {
		name = "Mozambican Style Cheese Burguer";
		sauce = "Spicy mozambican sauce";
		buns = "Cookie dough buns";
	}
	
	@Override
	public void cook() {
		System.out.println("Cooking Mozambican style ....");
	}
}
