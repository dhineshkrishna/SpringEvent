package com.event.publisher;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import com.event.events.ShowEvent;

@Component
public class ZeeHDShowPublish {
	private final ApplicationEventPublisher eventPublisher;

	private ZeeHDShowPublish(ApplicationEventPublisher eventPublisher) {
		super();
		this.eventPublisher = eventPublisher;
	}

	public void publishEvent(ShowEvent event) {
		eventPublisher.publishEvent(event);
	}
	
	public void publicmesgEvent(String string) {
		eventPublisher.publishEvent(string);
	}
}
