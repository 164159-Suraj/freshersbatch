package com.suraj.restapi.Assignment3;

import java.util.HashMap;
import java.util.Map;

public class DatabaseClass {
	Map<Integer, UserInformation> info=new HashMap<Integer, UserInformation>(); 

	public DatabaseClass(){
		info.put(101, new UserInformation("Odisha", "Bhubaneswar", "India"));
		info.put(100, new UserInformation("Karnataka", "Bangalore", "India"));
	}
	
	public  Map<Integer, UserInformation> getInfo(){
		return info;
	}
}
