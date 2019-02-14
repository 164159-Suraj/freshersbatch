package com.suraj.restapi.Assignment2;

import java.util.ArrayList;

public class DatabaseClass {
	ArrayList<UserPojo> user=new ArrayList<UserPojo>();
	public DatabaseClass(){
		user.add(new UserPojo("Suraj", "1234"));
	}
	public ArrayList<UserPojo> getUser(){
		return user;
	}

}
