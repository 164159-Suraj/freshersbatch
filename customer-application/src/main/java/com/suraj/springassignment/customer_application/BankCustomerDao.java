package com.suraj.springassignment.customer_application;

import java.util.ArrayList;

import org.springframework.stereotype.Component;


public class BankCustomerDao {
	ArrayList<BankAccount> bankUsers = null;

	public BankCustomerDao() {
		bankUsers = new ArrayList<BankAccount>();
		bankUsers.add(new BankAccount(123, "Suraj", "Savings", 100000));
		bankUsers.add(new BankAccount(456, "Vidya", "Salary", 120000));
		bankUsers.add(new BankAccount(789, "Manish", "Current", 152));
		bankUsers.add(new BankAccount(255, "Poojitha", "Savings", 15000));
	}

	public ArrayList<BankAccount> getAllBankUserlist() {
		return bankUsers;
	}
}
