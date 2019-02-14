package com.suraj.collection_assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ReverseOrder {

	public static void main(String[] args) {
		
		List<String> obj1=new ArrayList<String>();
		obj1.add("Suraj");
		obj1.add("Raju");
		obj1.add("Sanjay");
		obj1.add("Ranjan");
		obj1.add("sumeet");
		
		System.out.println(obj1);
		System.out.println();
		
		ListIterator<String> view=obj1.listIterator();
		
		System.out.println("Printing The List in same order:");
	
		while(view.hasNext()){
			System.out.print(view.next()+" ");
		}
		
		System.out.println();
		System.out.println("==============================");
		System.out.println("Printing The List in Reverse order:");
		while(view.hasPrevious()){
			System.out.print(view.previous()+" ");
		}

	}

}
