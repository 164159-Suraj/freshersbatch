package com.suraj_mitra.ds;

public class Test {

	public static void main(String[] args) {

		int array[] = { 300, 100, 700, 400, 200 };
		
		int[] A = Ascending(array);

	
		int[] B = new Test().Descending(array);

		System.out.println("The Original Array is:");
		for (int index = 0; index < array.length; index++) {
			System.out.print(array[index] + " ");
		}
		System.out.println();
		
		 System.out.println("The ascending Order is :");
		 
		  for (int index = 0; index < A.length; index++) {
		  System.out.print(A[index] + " "); }
		 
		System.out.println();
		System.out.println("The descending Order is :");
		for (int index = 0; index < B.length; index++) {
			System.out.print(B[index] + " ");
		}
		
	}

	
	  static int[] Ascending(int b[]) {
		  int temp;
			int barr[]=new int[b.length];
			for (int i = 0; i < b.length; i++) {
				barr[i]=b[i];
			}
	  for (int index = 0; index <barr.length; index++) { 
		  for (int index1 = 0; index1 < barr.length - index -1; index1++) 
		  { 
			  if (barr[index1] > barr[index1 + 1]) {
				  temp = barr[index1];
	              barr[index1] = barr[index1 + 1]; 
	              barr[index1 + 1] = temp; } }
	  
	  } 
	  return barr;
	  
	  }
	 

	int[] Descending(int a[]) {
		int temp;
		int arr[]=new int[a.length];
		for (int i = 0; i < a.length; i++) {
			arr[i]=a[i];
		}
		for (int index = 0; index < arr.length; index++) {
			for (int index1 = 0; index1 < arr.length - index - 1; index1++) {
				if (arr[index1] < arr[index1 + 1]) {
					temp = arr[index1];
					arr[index1] = arr[index1 + 1];
					arr[index1 + 1] = temp;
				}
			}

		}
		return arr;

	}

}
