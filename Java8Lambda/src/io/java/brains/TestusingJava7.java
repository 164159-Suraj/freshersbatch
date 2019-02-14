package io.java.brains;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestusingJava7 {

	public static void main(String[] args) {
		List<Person> per=Arrays.asList(new Person("Suraj","Mitra",22),
				new Person("Manish","Kumar",24),
				new Person("Simar","Singh",26),
				new Person("Sanjiv","Mitra",49));
		
		//sorting all based on last name
		Collections.sort(per, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getLastName().compareTo(o2.getLastName());
			}
		});
		
		//Printing all after sorting
		printall(per);
		
		
		System.out.println();
		System.out.println("=================================================");
		System.out.println();
		
		//printing the persons whose last name starts with m
		printwithcondition(per,new Condition() {
			
			@Override
			public boolean test(Person p) {
				return p.getLastName().startsWith("M");
			}
		});

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
	
	interface Condition{
		public boolean test(Person p);
	}

}
