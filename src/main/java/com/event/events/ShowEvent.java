package com.event.events;

public class ShowEvent {
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public ShowEvent(String message) {
		super();
		this.message = message;
	}

}
