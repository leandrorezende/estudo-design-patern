package com.designpatterns.models;

import com.designpatterns.controllers.AuthenticateMethod;

public class FingerPrint implements AuthenticateMethod{

	@Override
	public boolean authenticate() {
		System.out.println("fingerprint reader recognize user's fingerprint");
		return true;
	}

}

