package com.designpatterns;

import com.designpatterns.interfaces.HamburgerStore;
import com.designpatterns.model.JamaicaHamburguerStore;
import com.designpatterns.model.MozambicanHamburguerStore;

public class Main {
	
	public static void main(String[] args) {
		HamburgerStore jamaicanStore = new JamaicaHamburguerStore();
		HamburgerStore mozambicanStore = new MozambicanHamburguerStore();
		
		System.out.println("Jamaican customer orders a cheeseburguer");
		jamaicanStore.orderHamburger("cheese");

		System.out.println();
		
		System.out.println("Mozambican customer orders a cheeseburguer");
		mozambicanStore.orderHamburger("cheese");
		
		System.out.println();
		
		System.out.println("Mozambican customer orders a veggie");
		mozambicanStore.orderHamburger("veggie");
	}
}
