package com.suraj.bank;

public class CurrentAccount extends BankAccount1 {
private double odllimit;
public CurrentAccount(String name, double balance){
	/*this.accountHolderName=name;
	 this.accountBalance=balance;*/
	 super(name,balance);
	 this.odllimit=20000;
}
public CurrentAccount(){
	 this.odllimit=20000;
}
public double Odllimit(){
	 return odllimit;
}

@Override
	public void withdraw(double amount) {
		
		double diff;
		if(amount>accountBalance){
		   diff=amount-accountBalance;
		   //System.out.println(diff);
		   System.out.println("My original odlimit is: "+odllimit);
		   odllimit=odllimit-diff;
		  System.out.println("After deducting my odlimit: "+odllimit);
		  accountBalance=0;
		}
		else
			System.out.println(accountBalance-amount);
		
	}
}