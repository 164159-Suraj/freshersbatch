package com.suraj.collection_assignment;

import java.util.TreeSet;
public class BankAccountList {
	
public static void main(String[] args) {
	TreeSet<SavingAccount> tree=new TreeSet<SavingAccount>();
	tree.add(new SavingAccount("Suraj", 15000, 100));
	tree.add(new SavingAccount("Manish", 1500, 101));
	tree.add(new SavingAccount("Simar", 10000, 102));
	tree.add(new SavingAccount("Rjesh", 1000, 103));
	for(SavingAccount index:tree){
		System.out.println(index);
	}
}
}
