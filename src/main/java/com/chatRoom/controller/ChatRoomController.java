package com.chatRoom.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.chatRoom.model.ChatMassage;

@Controller
public class ChatRoomController {
	
//	@MessageMapping("/sendMessage") //maps the websocket massages to the destination
//	@SendTo("/topic/messages")
//	public ChatMassage sendMassage(ChatMassage msg) {
//		return msg;
//	}
	
	@MessageMapping("/sendMessage")
	@SendTo("/topic/messages")
	public ChatMassage sendMassage(ChatMassage msg) {
	    System.out.println("Received from client: " + msg.getSender() + " - " + msg.getContent());
	    return msg;
	}

	
	@GetMapping("/chat")
	public String chat() {
		return "chat";
	}

}
