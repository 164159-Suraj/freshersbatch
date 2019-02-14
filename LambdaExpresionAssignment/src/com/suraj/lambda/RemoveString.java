package com.suraj.lambda;

import java.util.ArrayList;
import java.util.stream.Collectors;
public class RemoveString {

	public static void main(String[] args) {
		ArrayList<String> values=new ArrayList<String>();
		values.add("Sonu");
		values.add("Suraj");
		values.add("Sanjiv");
		values.add("Onkar");
		values.add("Ajay");
		
		//Total value of the List
		System.out.println("The List contains:");
		System.out.println(values);
		
		
		ArrayList<String> oddLength=(ArrayList<String>) values.stream().filter(index->index.length()%2!=0).collect(Collectors.toList());
		
		//Value of the list after checking the length of each value is odd
		System.out.println("The values of the List after performing operation is:");
		System.out.println(oddLength);
	}

}
