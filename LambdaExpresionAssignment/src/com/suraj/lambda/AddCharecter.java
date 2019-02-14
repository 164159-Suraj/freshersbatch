package com.suraj.lambda;

import java.util.ArrayList;

public class AddCharecter {
	public static void main(String[] args) {
		ArrayList<String> values=new ArrayList<String>();
		values.add("Sonu");
		values.add("Suraj");
		values.add("Sanjiv");
		values.add("Onkar");
		values.add("Ajay");
		
		//StringBuilder str=new StringBuilder( );
		//char []a=
		Character []str=values.stream().map(index->index.charAt(0)).toArray(Character []::new);
		for(Character i:str){
			System.out.print(i);
		}
	}

}
