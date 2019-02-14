package com.suraj.test;

import com.suraj.bank.BankAccount1;
import com.suraj.bank.CurrentAccountver2;
import com.suraj.bank.SavingAccountver2;
import com.suraj.bank.SavingsAccount;
import com.suraj.bank.CurrentAccount;

public class TestBankAccount {
	/*public static void testBankAccountMethod() {
		BankAccount1 acc = new BankAccount1();
	}*/

	public static void testSavingAccount() {

		SavingsAccount savingsAcc2 = new SavingsAccount();
		SavingsAccount savingsAcc = new SavingsAccount("Suraj", 5000);
		System.out.println("Account no is " + savingsAcc.getAccountNo());
		System.out.println("Account Balance is "
				+ savingsAcc.getAccountBalance());
		savingsAcc.deposit(5000);
		System.out.println("Account Balance is "
				+ savingsAcc.getAccountBalance());
		savingsAcc.withdraw(3000);
		System.out.println("Account Balance is "
				+ savingsAcc.getAccountBalance());
		System.out.println("salary account " + savingsAcc.IsSalaryaccount());
	}

	/*
	 * public static void testCurrentAccount(){ CurrentAccount CurrentAcc=new
	 * CurrentAccount("Suraj",5000); CurrentAccount CurrentAcc2=new
	 * CurrentAccount(); System.out.println("Account no is "+
	 * CurrentAcc.getAccountNo()); System.out.println("Account Balance is "+
	 * CurrentAcc.getAccountBalance()); CurrentAcc.deposit(5000);
	 * System.out.println("Account Balance is "+
	 * CurrentAcc.getAccountBalance()); CurrentAcc.withdraw(3000);
	 * System.out.println("Account Balance is "+
	 * CurrentAcc.getAccountBalance());
	 * System.out.println("Salary Account:  "+CurrentAcc2.Odllimit()); }
	 */
	public static BankAccount1 getBankAccount(String accountType){
		BankAccount1 acc=null;
		if(accountType.equals("Saving"))
			acc=new SavingsAccount("onkar",4000);
		else if(accountType.equals("Current"))
			acc=new SavingsAccount("rahul",7000);
		else
			acc=null;
		return acc;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * testSavingAccount(); testCurrentAccount();
		 */
	/*	CurrentAccount currentAcc3 = new CurrentAccount("Suraj", 40000);
		System.out.println("My Account Balance is:"+ currentAcc3.getAccountBalance());
	
		currentAcc3.withdraw(50000);
		System.out.println("now The Account Balance: "+currentAcc3.getAccountBalance());*/
	/*	BankAccount1 acc=getBankAccount("Current");
		System.out.println("Account Name:"+acc.getAccountHolderName());
		System.out.println("Account Balance:"+acc.getAccountBalance());
		acc.withdraw(3000);
		System.out.println("Account Balance:"+acc.getAccountBalance());*/
		
		SavingAccountver2 acc=new SavingAccountver2();
		acc.withdraw(4000);
		//acc.deposit(4000);
		System.out.println(acc.IsSalaryaccount());
		System.out.println(acc.getInsuranceName());
		CurrentAccountver2 acc1=new CurrentAccountver2();
		acc1.withdraw(4000);
		//acc.deposit(4000);
		System.out.println(acc.getInsuranceName());
	}

}
