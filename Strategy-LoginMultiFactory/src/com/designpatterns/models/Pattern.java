package com.designpatterns.models;

import com.designpatterns.controllers.AuthenticateMethod;

public class Pattern implements AuthenticateMethod{

	@Override
	public boolean authenticate() {
		System.out.println("system identify pattern");
		return true;
	}

}
