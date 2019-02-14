package com.suraj.employee;

public class EmployeeCredentials {
	String empname,password;

	public String getEmpname() {
		return empname;
	}


	public void setEmpname(String empname) {
		this.empname = empname;
	}


	public String getPassword() {
		return password;
	}

	
	public void setPassword(String password) {
		this.password = password;
	}


	public EmployeeCredentials(String empname, String password) {
		super();
		this.empname = empname;
		this.password = password;
	}


	@Override
	public String toString() {
		return "EmployeeCredentials [empname=" + empname + ", password="
				+ password + "]";
	}
	
}
