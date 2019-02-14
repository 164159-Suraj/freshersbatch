package com.suraj.lambda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.stream.Collectors;

public class AppendKeyValue {

	public static void main(String[] args) {
		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		hm.put(100, "Suraj");
		hm.put(101, "Sanjay");
		hm.put(102, "Ritu");
		hm.put(103, "Sonu");
		hm.put(104, "Kajal");
		System.out.println("Key-Value pair inside a map:");
		System.out.print(hm);
		System.out.println();
		System.out.print("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		ArrayList<String> view=(ArrayList<String>) hm.entrySet().stream().map(index->index.getKey()+index.getValue()).collect(Collectors.toList());
		
		System.out.println();
		System.out.println("Appending the key and value pair");
		System.out.println(view);
		System.out.println("============================================================");
		String str=view.stream().map(index->index).reduce("", String::concat);
		System.out.println("Appending all the String values to a single value");
		System.out.println(str);
			
		
	}

}
