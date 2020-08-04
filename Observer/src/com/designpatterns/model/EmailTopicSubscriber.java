package com.designpatterns.model;

import com.designpatterns.interfaces.Observer;
import com.designpatterns.interfaces.Subject;

public class EmailTopicSubscriber implements Observer{

	private String name;
	private Subject topic;
	
	public EmailTopicSubscriber(String name) {
		this.name = name;
	}

	@Override
	public void update() {
		String msg = (String) topic.getUpdate(this);
		if(msg == null)
			System.out.println(name + " No new message on this topic!");
		else 
			System.out.println(name + " Retriving message: " + msg);
		
	}

	@Override
	public void setSubject(Subject subject) {
		this.topic = subject;
	}

}
