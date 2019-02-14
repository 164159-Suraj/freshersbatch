package com.suraj.springassignment.customer_application;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


public class BankAccountServiceImpl implements BankAccountService {

	public BankCustomerDao getDao() {
		return dao;
	}



	
	public void setDao(BankCustomerDao dao) {
		this.dao = dao;
		bankUserslist = dao.getAllBankUserlist();	
	}

	
	BankCustomerDao dao = new BankCustomerDao();
	ArrayList<BankAccount> bankUserslist = null;
	
	
	public BankAccountServiceImpl(){
	
		bankUserslist = dao.getAllBankUserlist();	
		
		}
	
	
	@Override
	public double withdraw(long accountId, double balance) {
		double x = 0;
		for (BankAccount index : bankUserslist) {
			if (index.getAccountId() == accountId) {
				x = index.getAccountBal()-balance;
			}
		}
		return x;
	}

	
	@Override
	public double deposit(long accountId, double balance) {
		double x = 0;
		for (BankAccount index : bankUserslist) {
			if (index.getAccountId() == accountId) {
				x = index.getAccountBal()+balance;
			}
		}
		return x;
	}

	
	@Override
	public double getBalance(long accountId){
		double x = 0;
		for (BankAccount index : bankUserslist) {
			if (index.getAccountId() == accountId) {
				x = index.getAccountBal();
			}
		}
		return x;
	}

	@Override
	public boolean fundTransfer(long fromAccountId, long toAccountId,double amount) {
			
		
		
		double x = 0;
		double y= 0;
		double senderBal,receiverBal;
		boolean exist=false;
		
		
		   for (BankAccount index : bankUserslist) {
			if (index.getAccountId() == fromAccountId) {
				x = index.getAccountBal();
			}
		   }
			
			
			for (BankAccount index1 : bankUserslist) {
				if (index1.getAccountId() == toAccountId) {
					y = index1.getAccountBal();
				}
		     }
			
			
			
			if(x>amount){
			senderBal=x-amount;
			receiverBal=y+amount;
			 exist=true;
			}
			return exist;
}
	
	
}









