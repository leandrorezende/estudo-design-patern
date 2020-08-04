package com.designpatterns.model;

import com.designpatterns.interfaces.HamburgerStore;

public class JamaicaHamburguerStore extends HamburgerStore{

	@Override
	public Hamburguer createHamburguer(String type) {
		
		if(type.equals("cheese"))
			return new JamaicaCheeseBurguer();
		else if(type.equals("veggie")) {
			return new JamaicaVeggieBurguer();
		} else 
			return null;
	}

}
