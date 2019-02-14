package com.suraj.employee;

import java.util.ArrayList;

public class DatabaseClass {
	ArrayList<EmployeeCredentials> arr=new ArrayList<EmployeeCredentials>();
	
	public DatabaseClass() {
		arr.add(new EmployeeCredentials("Suraj","1234"));
		arr.add(new EmployeeCredentials("Akash","5678"));
		arr.add(new EmployeeCredentials("Ajay","3333"));
	}
	public ArrayList<EmployeeCredentials> getAllData(){
		return arr;
	}
}
