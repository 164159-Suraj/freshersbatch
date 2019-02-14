package com.suraj.collection_assignment;

import java.util.TreeSet;

 
public class TestPerson {

	public static void main(String[] args) {
		//Person p1=new Person(6,65,"Suraj");
		//Person p2=new Person(7,65,"Manish");
		//Person p3=new Person(8,70,"Rahul");
		TreeSet<Person> person=new TreeSet<Person>();
		person.add(new Person(7,85,"Suraj"));
		person.add(new Person(8,85,"manish"));
		person.add(new Person(9,70,"Raju"));
		
		for(Person p:person){
			System.out.println(p);
		}
	}

}
