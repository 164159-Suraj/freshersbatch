package com.suraj.dao;

import java.util.ArrayList;

import com.suraj.pojo.User;

public class UserDAO implements IUserDao{
ArrayList<User> userList;

public UserDAO(){
	userList=new ArrayList<>();
	userList.add(new User("Suraj","Java","Admin"));
	userList.add(new User("Sachin","sql","User"));
	userList.add(new User("Rahul","Java","Admin"));
}
public String getUserType(String userName, String password){
	//userList.stream().map(user-> user.getUserName().equals(userName))
	for(User user:userList){
		if(user.getUserName().equals(userName)&& user.getPassword().equals(password)){
			return user.getUserType();
		}
	}
	throw new InvalidUserException("User name and password doesnot exists.......");
}
@Override
public void addUser(User user) {
	// TODO Auto-generated method stub
	
}
@Override
public void changePassword(String userName, String oldPassword,
		String newPassword) {
	// TODO Auto-generated method stub
	
}
@Override
public void removePassword(String userName) {
	// TODO Auto-generated method stub
	
}
}
