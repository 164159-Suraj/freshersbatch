package com.suraj_mitra.ds;
import java.util.Scanner;
public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double mark1,mark2,mark3;
		Scanner ac=new Scanner(System.in);
		System.out.println("Enter Three subjects Marks:");
		mark1=ac.nextDouble();
		mark2=ac.nextDouble();
		mark3=ac.nextDouble();
		if(mark1>60&&mark2>60&&mark3>60){
			System.out.println("Passed");
		}
		else if((mark1>60&&mark2>60)||((mark2>60)&&(mark3>60)||(mark1>60&&mark3>60))){
			System.out.println("Promoted");
		}
		else
			System.out.println("Fail");
	}

}
