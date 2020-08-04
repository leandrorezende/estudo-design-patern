package com.designpatterns.controllers;

public class SmartPhone {
	public AuthenticateMethod authLoginMethod;
	
	public void authentication() {
		System.out.println(authLoginMethod.authenticate());
	}
}
