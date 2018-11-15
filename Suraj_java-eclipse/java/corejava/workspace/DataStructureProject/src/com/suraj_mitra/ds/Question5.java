package com.suraj_mitra.ds;
import java.util.Scanner;
public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner ac=new Scanner(System.in);
System.out.println("Enter your CTC");
double ctc=ac.nextInt();
double tax;
if(ctc>0 && ctc<=180000){
	System.out.println("Tax paid is :"+" "+"Nill");
}
else if(ctc>=181001 && ctc<=300000)
{
	tax=0.1*ctc;
	System.out.println("Tax paid is :"+" "+tax);
}
else if(ctc>=300001 && ctc<=500000)
{
	tax=0.2*ctc;
	System.out.println("Tax paid is :"+" "+tax);
}
else if(ctc>=500001 && ctc<=1000000)
{
	tax=0.3*ctc;
	System.out.println("Tax paid is :"+" "+tax);
}
	}

}
