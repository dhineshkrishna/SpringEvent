package com.event.listener;

import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import com.event.events.EmailEvent;

@Component
public class EmailListener {
	@EventListener
	@Async
	void sendMsgEvent(EmailEvent emailEvent) {
		System.out.println("EmailListener1"+emailEvent.getMessage());
	}
	
	@Async
	@EventListener
	void sendMsgEvent(String message) {
		System.out.println("Listener2"+message);
	}
}
