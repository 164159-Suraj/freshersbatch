package com.suraj.employee;

import java.util.ArrayList;

public class AccessLayer {
	DatabaseClass class1=new DatabaseClass();
	ArrayList<EmployeeCredentials> emp=class1.getAllData();
	
	
	boolean isValid(String name,String pass){
		boolean exist=false;
			for(EmployeeCredentials index:emp){
				if(name.equals(index.getEmpname())  && pass.equals(index.getPassword())){
					exist=true;
				}
			}
			return exist;
	}
}
