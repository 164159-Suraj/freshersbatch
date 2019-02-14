package com.suraj.streams;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestMain {

	public static void main(String[] args) {
		
		//Fruits ArrayList
		ArrayList<Fruit> fr=new ArrayList<Fruit>();
		fr.add(new Fruit("Banana", "Yellow", 105, 6));
		fr.add(new Fruit("Apple", "Red", 102, 10));
		fr.add(new Fruit("Orange", "Orange", 90, 8));
		fr.add(new Fruit("Mangoes", "Yellow", 98, 11));
		fr.add(new Fruit("Guava", "Green", 106, 9));
		fr.add(new Fruit("Strawberry", "Red", 100, 15));
		fr.add(new Fruit("Plums", "Red", 106, 8));
		
		
		//News ArrayList
		ArrayList<News> nw=new ArrayList<News>();
		nw.add(new News("Rahul", "Raj", "Excellent", 101));
		nw.add(new News("Suraj", "Sonu", "Satisfactory", 102));
		nw.add(new News("Sameer", "Shusant", "Faboulous", 103));
		nw.add(new News("Rahul", "Raj", "Good", 101));
		nw.add(new News("Rahul", "Raj", "Can Do Better", 101));
		nw.add(new News("Rahul", "Raj", "Very Well Done", 101));
		nw.add(new News("Suraj", "Sonu", "Very poor", 102));
		
		
		
		//Q1.Display the fruit names of low calories fruits i.e. calories < 100 sorted in descending order of calories.
		System.out.println("-----------------------Question 1-------------------------");
		ArrayList<Fruit> newfr=(ArrayList<Fruit>) fr.stream(). sorted((p1, p2) ->(p1.getCalories()<p2.getCalories())?1:(p1.getCalories()>p2.getCalories())?-1:0).filter(index->index.getCalories()>100).collect(Collectors.toList());
		for(Fruit index:newfr){
			System.out.println("Name:"+" "+index.getName()+" "+"Calorie:"+" "+index.getCalories());
			
		}
		
		System.out.println();
		
		
		//Q2.Display color wise list of fruit names.
		System.out.println("-----------------------Question 2-------------------------");
		ArrayList<Fruit> newfr1=(ArrayList<Fruit>) fr.stream().sorted((c1,c2)->(c1.getColor()).compareTo(c2.getColor())).collect(Collectors.toList());
		for(Fruit index:newfr1){
			System.out.println(index.getName()+" "+index.getColor());
		}
		
		System.out.println();
		
		//Q3.Display only RED color fruits sorted as per their price in ascending order.
		System.out.println("-----------------------Question 3-------------------------");
		ArrayList<Fruit>newfr2=(ArrayList<Fruit>) fr.stream().filter(index->index.getColor()=="Red").sorted((p1, p2) ->(p1.getPrice()<p2.getPrice())?1:(p1.getPrice()>p2.getPrice())?-1:0).collect(Collectors.toList());
		
		for(Fruit index:newfr2){
			System.out.println(index.getName()+"     "+index.getColor()+"     "+index.getPrice());
		}
		
		System.out.println();
		
		//Q4.Find out the newsId which has received maximum comments.
		System.out.println("-----------------------Question 4-------------------------");
		ArrayList<Integer> newar=(ArrayList<Integer>) nw.stream().map(index->index.getNewid()).collect(Collectors.toList());
		//System.out.println(newar);
		Map<Integer, Long> mp=newar.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(mp);
		
		long max=0;
		int key=0;
		 for (Map.Entry<Integer,Long> entry : mp.entrySet()){
			 if(entry.getValue()>max){
				 max=entry.getValue();
				 key=entry.getKey();
			 }
		 }
		 System.out.println("The maximum comments got by news id:"+" "+key+" "+"And The number of comments it got:"+" "+max);
		 System.out.println();
		 
		//Q5. Find out how many times the word 'budget' arrived in user comments all news.
		 System.out.println("-----------------------Question 5-------------------------");
		 	long x=nw.stream().filter(index->index.comment.contains("Budget")).count();
		 	System.out.println("The total budget words present are:"+x);
		 	System.out.println();
		 
		 
		//Q6.Find out which user has posted maximum comments.
		 	System.out.println("-----------------------Question 6-------------------------");
		 	System.out.println("Maximum comment given by the user:-  "+nw.stream().max(Comparator.comparing(News::getComment)).get(). getCommentByUser());
		    System.out.println();
		 
		 
		 
		 
		 
	  //Question 8. Find all transactions in the year 2011 and sort them by value (small to high).
		 System.out.println("-------------------------Question 8-----------------------------");
		ArrayList<Transaction> tr=new ArrayList<Transaction>(); 
		tr.add(new Transaction(2011,15000,new Trader("Suraj", "Odisha")));
		tr.add(new Transaction(2012,17000,new Trader("Ashna", "Pune")));
		tr.add(new Transaction(2011,14550,new Trader("Rajiv", "Pune")));
		tr.add(new Transaction(2013,13500,new Trader("Kajal", "Delhi")));
		tr.add(new Transaction(2013,20500,new Trader("Priti", "Delhi")));
		tr.add(new Transaction(2014,16000,new Trader("Manish", "Indore")));
		tr.add(new Transaction(2011,13000,new Trader("Rahul", "Mumbai")));
		
		ArrayList<Transaction> newtr=(ArrayList<Transaction>) tr.stream().filter(index->index.year==2011).sorted((i1,i2)->(i1.value<i2.value)?-1:(i1.value>i2.value)?1:0).collect(Collectors.toList());
		System.out.println(newtr);
		
		System.out.println();
		
		
	 //Question 9. What are all the unique cities where the traders work?
		 System.out.println("-------------------------Question 9-----------------------------");
		List<String> list=new ArrayList<String>();
		list=(List<String>) tr.stream().map(index->index.trader.getCity()).distinct().collect(Collectors.toList());
		 
		System.out.println(list);
		System.out.println();
		
		
	 //Question 10. Find all traders from Pune and sort them by name.
		 System.out.println("-------------------------Question 10-----------------------------");
	   List<String> list1=new ArrayList<String>();
	   list1=(List<String>) tr.stream().filter(index->index.trader.city=="Pune").map(index->index.trader.name).sorted().collect(Collectors.toList());
	   
	   System.out.print(list1);
	   System.out.println();
	   
		 
	//11. Return a string of all traders’ names sorted alphabetically.
	   System.out.println("-------------------------Question 11-----------------------------");
	  List<String> list2=new ArrayList<String>();
	  list2=(List<String>)tr.stream().map(index->index.trader.name).sorted().collect(Collectors.toList());
	  System.out.println(list2);
	 System.out.println();
	 
	 
	  
   //12.Are any traders based in Indore?
	  System.out.println("-------------------------Question 12-----------------------------");
	
	  Consumer<? super Transaction> con1=index->{
		  if(index.trader.city=="Indore"){
			  System.out.println(index.trader.name+"  " + " is present in Indore");
			  }
		  else
			  System.out.println(index.trader.name+"  "+"Not in Indore");
			  
	  };
	tr.stream().forEach(con1);
	System.out.println();
	
	//13.Print all transactions’ values from the traders living in Delhi
	 System.out.println("-------------------------Question 13-----------------------------");
	 	
	 tr.stream().filter(index->index.trader.city=="Delhi").map(index->index.value).forEach(c->System.out.println(c+"  "+"Transaction value in Delhi"));
	 System.out.println();
		
		 
	//14.  What’s the highest value of all the transactions?
	 System.out.println("-------------------------Question 14-----------------------------");	 
	 
		 int max1=tr.stream().map(index->index.value).max(Integer::compare).get();
		 System.out.println("The maximum transaction nvalue is:"+" "+max1);
		 
		 System.out.println();
		 
	//15.   What’s the smallest value of all the transactions?
	System.out.println("-------------------------Question 15-----------------------------");		 
		 
		 int min1=tr.stream().map(index->index.value).min(Integer::compare).get();
		 System.out.println("The minimum trasanction value is:"+" "+min1);
		 
		 
		
	}

}
