package com.suraj.restapi.messenger;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MessageService {
	
	DatabaseClass dao=new DatabaseClass();
	Map<Long, MessagePojo> messages=dao.getMessages();

	ArrayList<MessagePojo> list=new ArrayList<MessagePojo>();
	/*public MessageService(){
		list.add(new MessagePojo(1l, "Hello World", "Suraj"));
		list.add(new MessagePojo(2l, "Hy Everyone", "Mitra"));
	}
	public ArrayList<MessagePojo> getAllMessages(){
		return list;
	}*/
	
	public ArrayList<MessagePojo> getAllMessages(){
		return (ArrayList<MessagePojo>) (messages.values());
	}
	public static void main(String[] args) {
		MessageService m=new MessageService();
		for(MessagePojo pojo:m.messages.values()){
			System.out.println(" "+pojo.getMessage());
		}
		
	}
}
