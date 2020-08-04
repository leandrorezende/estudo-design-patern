package com.designpatterns;

import com.designpatterns.model.Facebook;
import com.designpatterns.model.User;

public class Main {
	public static void main(String[] args) {
		Facebook socialMedia = new Facebook();

		User user1 = new User("Felipe Mass");
		User user2 = new User("Rubens Barichello");

		socialMedia.assign(user1);
		socialMedia.assign(user2);

		user1.setSocialMedia(socialMedia);
		user2.setSocialMedia(socialMedia);
		socialMedia.updateFeed();
		System.out.println("\nFacebook new feed");
		socialMedia.postTopic("Ferrari get 100km/h in just one second");
		
		System.out.println("\nBarrichello gets upsed unAssing Facebook");
		socialMedia.unAssign(user2);
		
		System.out.println("\nFacebook new feed");
		socialMedia.postTopic("New neon led lamp cause problems to drivers in German");
	}
}
