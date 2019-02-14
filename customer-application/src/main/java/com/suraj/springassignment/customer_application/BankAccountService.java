package com.suraj.springassignment.customer_application;

public interface BankAccountService {

	public double withdraw(long accountId, double balance);

	public double deposit(long accountId, double balance);

	public double getBalance(long accountId);

	public boolean fundTransfer(long fromAccountId, long toAccountId,
			double amount);
}
