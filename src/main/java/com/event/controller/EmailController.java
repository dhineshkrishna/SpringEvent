package com.event.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.event.events.EmailEvent;
import com.event.events.ShowEvent;
import com.event.publisher.EmailPublisher;
import com.event.publisher.ZeeHDShowPublish;

@RestController
public class EmailController {
	@Autowired
	EmailPublisher emailPublisher;
	
	@Autowired
	ZeeHDShowPublish showPublish;

	@GetMapping("/notifyEvent")
	public String publishEvent() {
		emailPublisher.publishEmailEvent(new EmailEvent("Employee added."));
		emailPublisher.publishMsgEvent("Exception Occured.");
		return "Succesfully runs...";
	}
	
	@GetMapping("notifyShow")
	public String publisghShow()
	{
		showPublish.publicmesgEvent("Good show");
		showPublish.publishEvent(new ShowEvent("publised"));
		return "show runs good";
	}
}
