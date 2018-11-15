package com.suraj_mitra.ds;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=100;i<=999;i++){
			int j=i,count=0,k=i,rem,sum=0;
			double product;
			while(j!=0){
				j=j/10;
				count++;
			}
			while(k!=0){
				rem=k%10;
				product=Math.pow(rem, count);
				sum+=product;
				k=k/10;
			}
			if(sum==i){
				System.out.print(i+" ");
			}
		}

	}

}
