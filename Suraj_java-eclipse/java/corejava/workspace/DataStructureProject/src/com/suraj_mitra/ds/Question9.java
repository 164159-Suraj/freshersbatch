package com.suraj_mitra.ds;
import java .util.Scanner;
public class Question9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner ac=new Scanner(System.in);
int sum1=0,sum2=0,sum3=0;
double avg1,avg2,avg3;
System.out.println("Enter three subjects marks of first Student");
int a[]=new int[3];
for(int i=0;i<3;i++){
	a[i]=ac.nextInt();
	sum1+=a[i];
}
System.out.println("Enter three subjects marks of second Student");
int b[]=new int[3];
for(int i=0;i<3;i++){
	b[i]=ac.nextInt();
	sum2+=b[i];
}
System.out.println("Enter three subjects marks of third Student");
int c[]=new int[3];
for(int i=0;i<3;i++){
	c[i]=ac.nextInt();
	sum3+=c[i];
}
avg1=sum1/3;
avg2=sum2/3;
avg3=sum3/3;
System.out.println("1st Student Total Marks:"+" "+sum1+" "+"Average:"+avg1);
System.out.println("2nd Student Total Marks:"+" "+sum2+" "+"Average:"+avg2);
System.out.println("3rd Student Total Marks:"+" "+sum3+" "+"Average:"+avg3);
int sum4=0,avg4;
int d[]=new int[3];
System.out.println("Each Respective subjects sum:");
for(int i=0;i<3;i++){
	d[i]=a[i]+b[i]+c[i];
}
for(int i=0;i<3;i++){
	System.out.print(d[i]+" ");
}

	}

}
