package com.suraj.restapi.messenger;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("messages")
public class MessageResource {

	@GET
	@Produces(javax.ws.rs.core.MediaType.APPLICATION_XML)
	public ArrayList<MessagePojo> getMessage(){
		MessageService msg=new MessageService();
		return  msg.getAllMessages();
		
	}
}
