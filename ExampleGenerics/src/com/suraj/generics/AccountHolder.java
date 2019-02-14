package com.suraj.generics;

public class AccountHolder {
	String holder_name;
	double holder_balance;
	AccountHolder(String h_name,int h_balance){
		this.holder_name=h_name;
		this.holder_balance=h_balance;
		}
	/**
	 * @return the holder_name
	 */
	public String getHolder_name() {
		return holder_name;
	}
	/**
	 * @param holder_name the holder_name to set
	 */
	public void setHolder_name(String holder_name) {
		this.holder_name = holder_name;
	}
	/**
	 * @return the holder_balance
	 */
	public double getHolder_balance() {
		return holder_balance;
	}
	/**
	 * @param holder_balance the holder_balance to set
	 */
	public void setHolder_balance(double holder_balance) {
		this.holder_balance = holder_balance;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "AccountHolder [holder_name=" + holder_name
				+ ", holder_balance=" + holder_balance + "]";
	}
	
}
