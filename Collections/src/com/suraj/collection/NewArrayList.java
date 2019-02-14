package com.suraj.collection;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
public class NewArrayList {

	public static void main(String[] args) {
		
		Scanner ac=new Scanner(System.in);
		String s;
//Operations On String Array List: And the Operations Like(Add,remove);
		List<String> obj1=new ArrayList<String>();
		obj1.add("Suraj");
		obj1.add("Raju");
		obj1.add("Sanjay");
		obj1.add("Ranjan");
		obj1.add("sumeet");
		System.out.println(obj1);
		obj1.add(2,"Rakesh ");
		System.out.println(obj1);
		obj1.remove(2);
		System.out.println(obj1);
		
		
		for(int index=0;index<4;index++){
			System.out.println("Enter values to the list");
			s=ac.next();
			obj1.add(index,s);
		}
		
		
		System.out.println(obj1);
		
		List<Integer> obj2=new ArrayList<Integer>();
		
		

	}

	

}
