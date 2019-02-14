package com.chaitali.project.jdbc;

public class User {

	String username;
	String lastname;
	int rollno;
	
	
	public User(){
		
	}
	
	public User(String username, String lastname, int rollno) {
		super();
		this.username = username;
		this.lastname = lastname;
		this.rollno = rollno;
	}
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @return the lastname
	 */
	public String getLastname() {
		return lastname;
	}
	/**
	 * @param lastname the lastname to set
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	/**
	 * @return the rollno
	 */
	public int getRollno() {
		return rollno;
	}
	/**
	 * @param rollno the rollno to set
	 */
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User [username=" + username + ", lastname=" + lastname
				+ ", rollno=" + rollno + "]";
	}
	
	
}
