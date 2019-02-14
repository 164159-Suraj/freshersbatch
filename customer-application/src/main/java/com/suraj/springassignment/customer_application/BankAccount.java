package com.suraj.springassignment.customer_application;

public class BankAccount {
	long accountId;
	String accountHoldername;
	String accountType;
	double accountBal;

public BankAccount(long accountId, String accountHoldername,
		String accountType, double accountBal) {
		super();
		this.accountId = accountId;
		this.accountHoldername = accountHoldername;
		this.accountType = accountType;
		this.accountBal = accountBal;
	}



	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "BankAccount [accountId=" + accountId + ", accountHoldername="
				+ accountHoldername + ", accountType=" + accountType
				+ ", accountBal=" + accountBal + "]";
	}



	/**
	 * @return the accountId
	 */
	public long getAccountId() {
		return accountId;
	}

	/**
	 * @param accountId
	 *            the accountId to set
	 */
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	/**
	 * @return the accountHoldername
	 */
	public String getAccountHoldername() {
		return accountHoldername;
	}

	/**
	 * @param accountHoldername
	 *            the accountHoldername to set
	 */
	public void setAccountHoldername(String accountHoldername) {
		this.accountHoldername = accountHoldername;
	}

	/**
	 * @return the accountType
	 */
	public String getAccountType() {
		return accountType;
	}

	/**
	 * @param accountType
	 *            the accountType to set
	 */
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	/**
	 * @return the accountBal
	 */
	public double getAccountBal() {
		return accountBal;
	}

	/**
	 * @param accountBal
	 *            the accountBal to set
	 */
	public void setAccountBal(double accountBal) {
		this.accountBal = accountBal;
	}
}
