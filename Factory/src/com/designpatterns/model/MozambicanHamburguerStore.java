package com.designpatterns.model;

import com.designpatterns.interfaces.HamburgerStore;

public class MozambicanHamburguerStore extends HamburgerStore{

	@Override
	public Hamburguer createHamburguer(String type) {
		if(type.equals("cheese"))
			return new MozambicanCheeseBurguer();
		else if(type.equals("veggie")) {
			return new MozambicanVeggieBurguer();
		} else 
			return null;
	}

}
