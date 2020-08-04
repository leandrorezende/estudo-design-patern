package com.designpatterns;

import com.designpatterns.controllers.SmartPhone;
import com.designpatterns.models.FaceRecognition;
import com.designpatterns.models.FingerPrint;
import com.designpatterns.models.Pattern;

public class Main {
	public static void main(String[] args) {
		SmartPhone smartPhone = new SmartPhone();
		System.out.println("User put place his finger");
		smartPhone.authLoginMethod = new FingerPrint();
		smartPhone.authentication();
		
		System.out.println("User draw something");
		smartPhone.authLoginMethod = new Pattern();
		smartPhone.authentication();
		
		System.out.println("User frame his face");
		smartPhone.authLoginMethod = new FaceRecognition();
		smartPhone.authentication();
	}
}
