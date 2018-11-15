package com.suraj_mitra.ds;
import java.util.Scanner;
public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Hello world");
Scanner scanner = new Scanner(System.in);
System.out.println("Enter a number");
int num = scanner.nextInt();
int x = num, y = num, rem,sum = 0;
int c = 0;
while (x != 0) {
	x = x / 10;
	c++;
}
while (y != 0) {
	rem = y % 10;
	
	double product=Math.pow(rem, c);
	sum += product;
	y = y / 10;

}

if (sum == num) {
	System.out.println("Amstrong Number");
} else
	System.out.println("Not Amstrong number");
	}

}
