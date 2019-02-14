package com.suraj.lambda;

import java.util.Scanner;
public class TestCalculate {

public static void main(String[] args)  {
     Scanner ac=new Scanner(System.in);
     System.out.println("Enter two numbers you want to perform operations on:");
     int first_num=ac.nextInt();
     int second_num=ac.nextInt();
     
     
     Calculate divideFunction=(int num1,int num2)->{
		  int a=0;
		  try{
			  a= num1/num2;	
		  }
		  catch(ArithmeticException e){
			  System.out.println("Cannot Divide by zero please enter a valid value");
		  }
		  return a;
	  };
     System.out.println("The quotient of two numbers if we divide them is");
     System.out.println(divideFunction.calculate(first_num, second_num));
	  
	  Calculate addFunction=(int num1,int num2)->num1+num2;
      System.out.println("The addition of two numbers is");
      System.out.println(addFunction.calculate(first_num, second_num));
      
	  Calculate subFunction=(int num1,int num2)->num1-num2;
      System.out.println("The subtraction of two numbers is");
      System.out.println(subFunction.calculate(first_num, second_num));
      
	  Calculate mulFunction=(int num1,int num2)->num1*num2;
      System.out.println("The multiplication of two numbers is");
      System.out.println(mulFunction.calculate(first_num, second_num));
      
	
      
	
     
      
      

	}

}
