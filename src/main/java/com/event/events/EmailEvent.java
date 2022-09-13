package com.event.events;

public class EmailEvent {
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public EmailEvent(String message) {
		super();
		this.message = message;
	}

}
