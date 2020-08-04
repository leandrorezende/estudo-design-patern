package com.designpatterns;

import com.designpatterns.interfaces.IceCream;
import com.designpatterns.model.BasicIceCream;
import com.designpatterns.model.ChocolateIceCream;
import com.designpatterns.model.VanillaIceCream;

public class Main {
	public static void main(String[] args) {
		IceCream basicIceCream = new BasicIceCream();
		System.out.println("Basic Ice-cream cost $" + basicIceCream.cost());
		
		IceCream chocolateIceCream = new ChocolateIceCream(basicIceCream);
		//wrapping basic icecream with chocolate
		System.out.println("Adding chocolate Ice-cream cost $" + chocolateIceCream.cost());
		
		IceCream vanillaChocolateIceCream = new VanillaIceCream(chocolateIceCream);
		//wrapping basic icecream with vanilla
		System.out.println("Adding vanilla Ice-cream cost $" + vanillaChocolateIceCream.cost());
	}
}
