package com.suraj_mitra.ds;

public class Main {
	public static void main(String[] args) {
		int array[] = { 300, 100, 700, 400, 200 };
		for (int i : array) {
			System.out.print(i+"  ");
		}
		System.out.println();
		for ( int p: new Main().desc(array)){
			System.out.print(p+"  ");
		}
		System.out.println("------------");
		for (int i : array) {
		System.out.println(i);	
		}
		System.out.println("------------");
	}

	int[] desc(int aa[]) {
		int a[]=new int[aa.length];
		for (int i = 0; i < aa.length; i++) {
			a[i]=aa[i];
		}
		int temp;
			for(int i=0;i<a.length-1;i++){
				for(int j=0;j<a.length-1-i;j++){
					if(a[j]>a[j+1]){
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					}
				}
			}
			System.out.println("******");
			for (int i : aa) {
				System.out.println(i);
			}
			System.out.println("*************");
		return a;
	}
}
