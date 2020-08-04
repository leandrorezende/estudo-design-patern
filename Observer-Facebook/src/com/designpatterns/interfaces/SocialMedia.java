package com.designpatterns.interfaces;

import java.util.Optional;

public interface SocialMedia {
	public void assign(Observer observer);
	public void unAssign(Observer observer);
	public void updateFeed();
	public Optional<String> getTopic();
}
