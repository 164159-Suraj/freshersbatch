package com.suraj.bank;

public class SavingsAccount extends BankAccount1{

boolean ISsalaryAccount;
 public SavingsAccount(String name, double balance){
	/*this.accountHolderName=name;
	 this.accountBalance=balance;*/
	 super(name,balance);
	 this.ISsalaryAccount=true;
}
 public SavingsAccount(){
	 this.ISsalaryAccount=true;
 }
 public boolean IsSalaryaccount(){
	 return ISsalaryAccount;
 }

}
