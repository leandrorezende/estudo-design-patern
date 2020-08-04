package com.designpatterns.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.designpatterns.interfaces.Observer;
import com.designpatterns.interfaces.SocialMedia;

public class Facebook implements SocialMedia {

	private String name;
	private List<Observer> observers;
	private String topic;

	public Facebook() {
		this.name = "Facebook";
		this.observers = new ArrayList<>();
	}

	@Override
	public void assign(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void unAssign(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void updateFeed() {
		this.observers.forEach(ob -> ob.updateFeed());
	}

	@Override
	public Optional<String> getTopic() {
		return topic != null ? Optional.of("Social Media " + this.name + " says " + this.topic) : Optional.empty();
	}
	
	public void postTopic(String topic) {
		this.topic = topic;
		updateFeed();
	}

}
