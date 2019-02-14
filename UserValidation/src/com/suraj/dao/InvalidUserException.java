package com.suraj.dao;

public class InvalidUserException extends RuntimeException {
	public InvalidUserException(String msg) {
		super(msg);
	}

}
