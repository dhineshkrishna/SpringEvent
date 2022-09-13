package com.event.publisher;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import com.event.events.EmailEvent;

@Component
public class EmailPublisher {
	private final ApplicationEventPublisher eventPublisher;

	private EmailPublisher(ApplicationEventPublisher eventPublisher) {
		super();
		this.eventPublisher = eventPublisher;
	}
	
	public void publishEmailEvent(EmailEvent event) {
		eventPublisher.publishEvent(event);
	}
	
	public void publishMsgEvent(String msg) {
		eventPublisher.publishEvent(msg);
	}
}
