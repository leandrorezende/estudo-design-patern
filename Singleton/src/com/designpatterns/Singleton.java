package com.designpatterns;

public class Singleton {
	// Singleton with double check option
	/*
	 *  volatile - ensures that multiple threads handle the instance
	 *  of this the unique instance in this case variable
	 *  when it is being initialized to the singleton instance
	 */
	private volatile static Singleton uniqueInstance;
	String name;
	
	private Singleton() {
		
	}
	
	// double check locking
	public static Singleton getInstance() {
		if(uniqueInstance == null) {
			synchronized ((Singleton.class)) {
				if(uniqueInstance == null) {
					uniqueInstance = new Singleton();
				}
			}
		}
		return uniqueInstance;
	}

}
