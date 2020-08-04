package com.designpatterns;

public class MyClass {
	private static MyClass uniqueInstance;
	public String name;
	
	private MyClass() {
	}
	
	public static synchronized MyClass getInstance() {
		if(uniqueInstance == null) {
			uniqueInstance = new MyClass();
		}
		return uniqueInstance;
	}
}
