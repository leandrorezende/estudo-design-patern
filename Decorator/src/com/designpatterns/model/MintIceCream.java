package com.designpatterns.model;

import com.designpatterns.interfaces.IceCream;

public class MintIceCream  extends IceCreamDecorator{

	public MintIceCream(IceCream iceCream) {
		super(iceCream);
	}

	@Override
	public double cost() {
		System.out.println("Adding Mint Ice-Cream!");
		return 1.5 + super.cost();
	}
}