package com.sathya.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sathya.service.MessageService;

@RestController
public class MessageController {
	@Autowired 
	MessageService service;

	
	@GetMapping("/sendMessage")
	public String produceMessage(@RequestParam("publish")String message)
	{
		service.sendMessage(message);
		return "Message Sent To Kafka";
		
	}
}
