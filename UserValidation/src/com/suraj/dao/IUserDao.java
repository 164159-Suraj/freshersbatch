package com.suraj.dao;

import java.sql.SQLException;

import com.suraj.pojo.User;

public interface IUserDao {
	public String getUserType(String userName, String password) throws SQLException;
	public void addUser(User user);
	public void changePassword(String userName, String oldPassword,String newPassword);
	public void removePassword(String userName);
}
