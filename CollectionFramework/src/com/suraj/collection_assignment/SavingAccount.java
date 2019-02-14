package com.suraj.collection_assignment;

public class SavingAccount implements Comparable<SavingAccount>{

boolean isSalaryAccount;
private  int accountNo;
private String accountHolderName;
protected double accountBalance;






//default constructor
/*public SavingAccount(){
	
	accountHolderName="Unknow";
	accountBalance=0;

	
 }*/
//constructor overloading


//parameterized constructor
public SavingAccount(String  accountHolderName,double accountBalance,int accountNo){
	
	this.accountHolderName= accountHolderName;
	this.accountBalance=accountBalance;
	this.accountNo=accountNo;
  }

//used to modify or reinitialize the existing values of member variables

/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */


public void setAccountHolderName(String accountHolderName) {
	this.accountHolderName = accountHolderName;
}


/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "SavingAccount [accountNo=" + accountNo + ", accountHolderName="
			+ accountHolderName + ", accountBalance=" + accountBalance + "]";
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

@Override
public int compareTo(SavingAccount s) {
	if(accountNo>s.accountNo){
		return 1;
	}
   else if(accountNo<s.accountNo){
		return -1;
	}
	return 0;
}


}
