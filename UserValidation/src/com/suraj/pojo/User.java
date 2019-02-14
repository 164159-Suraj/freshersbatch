package com.suraj.pojo;

public class User {
String userName,password,userType;

public User(String userName, String password, String userType) {
	this.userName = userName;
	this.password = password;
	this.userType = userType;
}

/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "User [userName=" + userName + ", password=" + password
			+ ", userType=" + userType + "]";
}

/**
 * @return the userName
 */
public String getUserName() {
	return userName;
}

/**
 * @param userName the userName to set
 */
public void setUserName(String userName) {
	this.userName = userName;
}

/**
 * @return the password
 */
public String getPassword() {
	return password;
}

/**
 * @param password the password to set
 */
public void setPassword(String password) {
	this.password = password;
}

/**
 * @return the userType
 */
public String getUserType() {
	return userType;
}

/**
 * @param userType the userType to set
 */
public void setUserType(String userType) {
	this.userType = userType;
}

}
