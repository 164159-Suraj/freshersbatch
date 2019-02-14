package com.suraj.springassignment.customer_application;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

public class BankAccountepositoryImpl implements BankAccountRepository {


	BankCustomerDao dao =new BankCustomerDao();
	ArrayList<BankAccount> bankUserslist = null;
	
	public BankAccountepositoryImpl() {
		bankUserslist = dao.getAllBankUserlist();
		
	}

	@Override
	public double getBalance(long accountId) {
		double x = 0;
		for (BankAccount index : bankUserslist) {
			if (index.getAccountId() == accountId) {
				x = index.getAccountBal();
			}
		}
		return x;
	}

	@Override
	public double updateBalance(long accountId, double newBalance) {
		double x = 0;
		for (BankAccount index : bankUserslist) {
			if (index.getAccountId() == accountId) {
				x = index.getAccountBal();
			}
		}
		x = newBalance;
		return x;

	}


}
