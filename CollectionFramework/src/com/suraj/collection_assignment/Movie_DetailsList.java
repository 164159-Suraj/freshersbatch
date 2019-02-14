package com.suraj.collection_assignment;

import java.util.TreeSet;
import java.util.Scanner;
public class Movie_DetailsList {
	
	static Scanner ac=new Scanner(System.in);
	Movie_Details add_movie(){
		String mname;
		String actor,actress,genere;
		System.out.println("Enter movie_name, actor,actress and genere:");
		mname=ac.next();
		actor=ac.next();
		actress=ac.next();
		genere=ac.next();
		return (new Movie_Details(mname,actor,actress,genere));
		
	}
	
	

	public static void main(String[] args) {
		Movie_DetailsList object=new Movie_DetailsList();
		TreeSet<Movie_Details> movie=new TreeSet<Movie_Details>();
		int x=ac.nextInt();
		switch(x){
		case 1:
			Movie_Details obj=object.add_movie();
			movie.add(obj);
			System.out.println("Your selected movie got added");
			break;
		case 2:
			
		}
		

	}

}
