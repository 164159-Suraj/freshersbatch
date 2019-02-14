package com.suraj.collection_assignment;

public class Person implements Comparable<Person>{
	

	@Override
	public String toString() {
		return "Person [height=" + height + ", weight=" + weight + ", name="
				+ name + "]";
	}



	double height,weight;
	String name;
	 public Person(double height, double weight,String name){
		 super();
		this.height=height;
		this.weight=weight;
		this.name=name;
	}





@Override
public int compareTo(Person per) {
	// TODO Auto-generated method stub
	if(weight>per.weight)
		return 1;
	else if(weight<per.weight)
		return -1;
	else if(height>per.height)
		return 1;
	else if(height<per.height)
		return -1;
	
	return 0;
}



/**
 * @param height the height to set
 */
public void setHeight(double height) {
	this.height = height;
}



/**
 * @param weight the weight to set
 */
public void setWeight(double weight) {
	this.weight = weight;
}



/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}



/**
 * @return the height
 */
public double getHeight() {
	return height;
}



/**
 * @return the weight
 */
public double getWeight() {
	return weight;
}



/**
 * @return the name
 */
public String getName() {
	return name;
}




	
	 
	 
}
