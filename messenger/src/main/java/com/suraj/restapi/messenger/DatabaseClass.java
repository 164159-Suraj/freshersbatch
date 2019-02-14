package com.suraj.restapi.messenger;

import java.util.HashMap;
import java.util.Map;

public class DatabaseClass {
	private static Map<Long, MessagePojo> messages=new HashMap< >();
	private static Map<Long, ProfilePojo> profiles=new HashMap< >();
	
	public DatabaseClass(){
		messages.put(1l, new MessagePojo(1l, "Hello World!!!!", "Suraj"));
		messages.put(2l, new MessagePojo(2l, "Hy Everyone!!!!", "Sanjay"));
		messages.put(3l, new MessagePojo(3l, "Good Morning!!!!", "Ritu"));
		messages.put(4l, new MessagePojo(4l, "Good Night!!!!", "Rajiv"));
	}
	
	public static Map<Long, MessagePojo> getMessages(){
		return messages;
	}
	public static Map<Long, ProfilePojo> getProfiles(){
		return profiles;
	}
	
	public static void main(String[] args) {
		DatabaseClass d=new DatabaseClass();
		System.out.println(d.getMessages());
	}
	
}
