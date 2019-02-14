package com.suraj.collection_assignment;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetcode {

	public static void main(String[] args) {
		HashSet<Integer> ordered=new HashSet<Integer>();
		
		ordered.add(6);
		ordered.add(4);
		ordered.add(5);
		ordered.add(1);
		ordered.add(3);
		ordered.add(2);
		
		System.out.println(ordered);
		
		
		System.out.println();
		System.out.println("============================");
		System.out.println();
		
		
		LinkedHashSet<Integer> unordered=new LinkedHashSet<Integer>();
		unordered.add(6);
		unordered.add(4);
		unordered.add(5);
		unordered.add(1);
		unordered.add(3);
		unordered.add(2);
		
		System.out.println(unordered);

	}

}
