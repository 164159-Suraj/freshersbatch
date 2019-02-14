package com.suraj.restapi.Assignment2;

public class UserPojo {
	String uname,pass;

	/**
	 * @return the uname
	 */
	public String getUname() {
		return uname;
	}

	/**
	 * @param uname the uname to set
	 */
	public void setUname(String uname) {
		this.uname = uname;
	}

	/**
	 * @return the pass
	 */
	public String getPass() {
		return pass;
	}

	/**
	 * @param pass the pass to set
	 */
	public void setPass(String pass) {
		this.pass = pass;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "UserPojo [uname=" + uname + ", pass=" + pass + "]";
	}

	public UserPojo(String uname, String pass) {

		this.uname = uname;
		this.pass = pass;
	}
	

}
