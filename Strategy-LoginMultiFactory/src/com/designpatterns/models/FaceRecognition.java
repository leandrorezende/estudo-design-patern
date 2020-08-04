package com.designpatterns.models;

import com.designpatterns.controllers.AuthenticateMethod;

public class FaceRecognition implements AuthenticateMethod{

	@Override
	public boolean authenticate() {
		System.out.println("camera capture user's face");
		return true;
	}

}
