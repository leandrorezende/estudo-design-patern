package com.designpatterns.model;

public class MozambicanVeggieBurguer extends Hamburguer {
	public MozambicanVeggieBurguer() {
		name = "Mozambican Style Veggie Burguer";
		sauce = "Spicy mozambican sauce";
		buns = "Cookie dough buns";
	}
	
	@Override
	public void cook() {
		System.out.println("Cooking Mozambican style ....");
	}
}
