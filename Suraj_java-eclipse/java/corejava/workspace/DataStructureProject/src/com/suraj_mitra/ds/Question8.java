package com.suraj_mitra.ds;
import java.util.Scanner;
public class Question8 {

	public static void main(String[] args) {
		int arr[]=new int[15],temp;
		Scanner ac=new Scanner(System.in);
		System.out.println("Enter values to the array:");
		for(int i=0;i<arr.length;i++){
			arr[i]=ac.nextInt();
		}
		System.out.println("The values in the array before sorting are:");
		for(int i=0;i<arr.length;i++){
		System.out.print(arr[i]+" ");
		}
		System.out.println("");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-i-1;j++){
				if(arr[j]<arr[j+1]){
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			
		}
		System.out.println("After Sorting The value of the array is :");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		}
	}


