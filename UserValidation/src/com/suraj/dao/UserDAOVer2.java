package com.suraj.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.suraj.pojo.User;

public class UserDAOVer2 implements IUserDao {

	@Override
	public String getUserType(String userName, String password) throws SQLException  {
		try{	
	Connection connection=ConnectionFactory.getConnection();
	
		PreparedStatement statement=connection.prepareStatement("select * from UserTable where userName=? and password=?");
		statement.setString(1, userName);
		statement.setString(2, password);
		ResultSet set=statement.executeQuery();
		while(set.next()){
			if(set.getString("userName").equals(userName)&&set.getString("password").equals(password)){
				return set.getString("userType");
			}
		}
	}catch(SQLException|ClassNotFoundException e){
		e.printStackTrace();
	}
	return null;
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
/*public static void main(String[] args) throws SQLException {
	System.out.println(new UserDAOVer2().getUserType("Suraj", "Java"));
}*/
}
