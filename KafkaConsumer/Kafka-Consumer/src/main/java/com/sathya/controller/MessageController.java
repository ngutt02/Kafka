package com.sathya.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sathya.receiver.MessageReceiver;

@RestController
public class MessageController {

	@Autowired
	MessageReceiver receiver;
	
	
	@GetMapping("/receiveMessage")
	public List receiveMessage()
	{
		return receiver.returnMessage();
	}
	
	
}
