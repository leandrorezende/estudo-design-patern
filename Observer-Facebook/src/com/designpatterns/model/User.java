package com.designpatterns.model;

import java.util.Optional;

import com.designpatterns.interfaces.Observer;
import com.designpatterns.interfaces.SocialMedia;

public class User implements Observer{

	private String username;
	private SocialMedia socialMedia;
	
	public User(String username) {
		this.username = username;
	}

	@Override
	public void setSocialMedia(SocialMedia socialMedia) {
		this.socialMedia = socialMedia;
	}

	@Override
	public void updateFeed() {
		Optional<String> topic = this.socialMedia.getTopic();
		if(!topic.isPresent())
			System.out.println(username + "'s feed update up to date");
		else
			System.out.println(username + "'s feed update: " + topic.get());
	}

}
