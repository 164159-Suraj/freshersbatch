package com.suraj.streams;

public class Transaction {
	int year ,value;
	Trader trader;
	public Transaction(int year, int value, Trader trader) {
	
		this.year = year;
		this.value = value;
		this.trader = trader;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Transaction [year=" + year + ", value=" + value + ", trader="
				+ trader + "]";
	}
	
}
