package com.sathya.receiver;

import java.util.ArrayList;
import java.util.List;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class MessageReceiver {

	List messages=new ArrayList();
	@KafkaListener(topics="MsgTopic",groupId="groudip")
	public void receiveMessage(String message)
	{
		//this.message=messge
		messages.add(message);
	}
	public List returnMessage()
	{
		return messages;
	}
}
