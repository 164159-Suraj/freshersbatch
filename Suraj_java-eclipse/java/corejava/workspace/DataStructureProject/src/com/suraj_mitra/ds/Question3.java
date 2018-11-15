package com.suraj_mitra.ds;
import java.util.Scanner;
public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double principal,rate,year,compound_interest,simple_interest;
		Scanner ac=new Scanner(System.in);
		System.out.println("Enter  principal,rate & year:");
		principal=ac.nextDouble();
		rate=ac.nextDouble();
		year=ac.nextDouble();
		simple_interest=(principal*rate*year)/100;
		double product=Math.pow((1+rate), year);
		compound_interest=(principal*product)-1;
		System.out.println("simple_interest:"+simple_interest);
		System.out.println("compound_interest:"+compound_interest);

	}

}
