package com.designpatterns;

import com.designpatterns.interfaces.Observer;
import com.designpatterns.model.EmailTopic;
import com.designpatterns.model.EmailTopicSubscriber;

public class Main {

	public static void main(String[] args) {

		EmailTopic topic = new EmailTopic();

		Observer firstObserver = new EmailTopicSubscriber("FirstObserver");
		Observer secondObserver = new EmailTopicSubscriber("SecondObserver");
		Observer thirdObserver = new EmailTopicSubscriber("ThirdObserver");

		// Registering observers
		topic.register(firstObserver);
		topic.register(secondObserver);
		topic.register(thirdObserver);
		
		// Attaching observer to subject
		firstObserver.setSubject(topic);
		secondObserver.setSubject(topic);
		thirdObserver.setSubject(topic);
		
		// Check for updates
		firstObserver.update();
		thirdObserver.update();
		
		// Provider/Subject (broadcast)
		topic.postMessage("Hello Subscribers!");
		
		topic.unregister(firstObserver);
		
		topic.postMessage("Hello Subscribers!");
	}

}
