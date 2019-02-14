package com.suraj.lambda;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class ReplacetoUppercase {

	public static void main(String[] args) {
		ArrayList<String> values=new ArrayList<String>();
		values.add("Sonu");
		values.add("Suraj");
		values.add("Sanjiv");
		values.add("Onkar");
		values.add("Ajay");
		
		ArrayList<String> new_values = (ArrayList<String>) values.stream().map(index->index.toUpperCase()).collect(Collectors.toList());
		System.out.println(new_values);

	}

}
