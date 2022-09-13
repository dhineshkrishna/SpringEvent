package com.event.listener;

import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import com.event.events.ShowEvent;

@Component
public class ZeeShowListener {
@EventListener
@Async
	public void publishshow(ShowEvent event) {
		System.out.println("Welcome 1st show"+event.getMessage());
	}
@EventListener
@Async
	public void publiMesgShow(String message) {
		System.out.println("This is good show  "+message);
	}
}
