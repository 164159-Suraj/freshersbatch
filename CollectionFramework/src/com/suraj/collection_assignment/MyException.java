package com.suraj.collection_assignment;

public class MyException extends Exception{
	String str;

	public MyException(String str) {
		this.str = str;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "MyException [str=" + str + "]";
	}
	

}
