package com.suraj.bank;



public class BankAccount1 {
	//static variable
	private static int autoAccountNo;

	//instance variable/ class variable
	private  int accountNo;
	private String accountHolderName;
	private double accountBalance;



	//init Block
	//Before constructor execution init Block Executes
	{
		  accountNo=++autoAccountNo;
		  
	}


	//default constructor
	public BankAccount1(){
		
		accountHolderName="Unknow";
		accountBalance=0;

		
	 }
	//constructor overloading


	//parameterized constructor
	public BankAccount1(String  accountHolderName,double accountBalance){
		
		this.accountHolderName= accountHolderName;
		this.accountBalance=accountBalance;
	  }

	//used to modify or reinitialize the existing values of member variables

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	

	public int getAccountNo() {
		return accountNo;
	}


	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}


	public double getAccountBalance() {
		return accountBalance;
	}


	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}


	public String getAccountHolderName() {
		return accountHolderName;
	}
	
	//sevice methods
	public void withdraw(double amount){
	 if(amount<=0){
		System.out.println("Enter a positive value");
		}
	 else if(amount>accountBalance){
			System.out.println("Enter a valid value");
			}
	   else	
		   this.accountBalance-=amount;
	}
	
	public void deposit(double amount){
		if(amount<=0){
			System.out.println("Enter a valid value");
			}
		
		else{
		  this.accountBalance+=amount;
		  System.out.println(accountBalance);
		}
	}
	


	public static void main(String[] args){
		BankAccount1 acc1=new BankAccount1();
		BankAccount1 acc2=new BankAccount1("Suraj",5000);
		System.out.println(acc2.accountBalance);
		acc2.deposit(0);
	}
	}


