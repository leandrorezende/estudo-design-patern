package com.designpatterns.interfaces;

import com.designpatterns.model.Hamburguer;

public abstract class HamburgerStore {
	public Hamburguer orderHamburger(String type) {
		Hamburguer burguer;
		
		burguer = createHamburguer(type);
		burguer.prepare();
		burguer.cook();
		burguer.box();
		
		return burguer;
	}
	
	abstract public Hamburguer createHamburguer(String type);
}
