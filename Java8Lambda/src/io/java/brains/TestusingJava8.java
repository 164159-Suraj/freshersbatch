package io.java.brains;


import io.java.brains.TestusingJava7.Condition;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestusingJava8 {

	public static void main(String[] args) {
		List<Person> per=Arrays.asList(new Person("Suraj","Mitra",22),
				new Person("Manish","Kumar",24),
				new Person("Simar","Singh",26),
				new Person("Sanjiv","Mitra",49));
		
		//sorting all based on last name
		Collections.sort(per,(Person p1,Person p2)->p1.getLastName().compareTo(p2.getLastName()));
		
		//Printing all after sorting
		printall(per);
		
		
		System.out.println();
		System.out.println("=================================================");
		System.out.println();
		
		//printing the persons whose last name starts with m
		printwithcondition(per,(p)->  p.getLastName().startsWith("M"));

	}

	private static void printwithcondition(List<Person> per,Condition condition) {
		for(Person i:per){
			if(condition.test(i))
			System.out.println(i);
		}
		
	}

	private static void printall(List<Person> per) {
		for(Person i:per){
			System.out.println(i);
		}
		
	}

}

