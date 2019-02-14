package com.suraj.employee;
import java.util.Scanner;
public class ValidateEmployee {

	public static void main(String[] args) {
	AccessLayer layer=new AccessLayer();
	Scanner ac=new Scanner(System.in);
	System.out.println("Hi....   Please Enter your user name and password");
	System.out.println("Username: ");
	String name=ac.next();
	System.out.println("Password: ");
	String pass=ac.next();

	boolean check=layer.isValid(name,pass);
	
	if(check){
		System.out.println("Hello User!!!!!!!!"+" "+name);
	}
	else{
		System.out.println("User not found");
	}

	}

}
