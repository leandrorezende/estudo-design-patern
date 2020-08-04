package com.designpatterns.model;

public class JamaicaVeggieBurguer extends Hamburguer {
	public JamaicaVeggieBurguer() {
		name = "Jamaican Style Veggie Burguer";
		sauce = "Spicy jamaican sauce";
		buns = "Cookie dough buns";
	}
	
	@Override
	public void cook() {
		System.out.println("Cooking Jamaica style ....");
	}
}
