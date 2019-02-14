package com.suraj.service;

import com.suraj.model.PrintHello;

public class ServiceHello {

	private PrintHello hello;

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ServiceHello [hello=" + hello + "]";
	}

	public PrintHello getHello() {
		return hello;
	}

	public void setHello(PrintHello hello) {
		this.hello = hello;
	}
	
}
