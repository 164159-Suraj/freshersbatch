package com.suraj.services.supp;

public class MyDate {
	private int dd;
	private int mm;
	private int yyyy;
	public MyDate(int dd, int mm, int yyyy) {
		super();
		this.dd = dd;
		this.mm = mm;
		this.yyyy = yyyy;
	}
	/**
	 * @return the dd
	 */
	public int getDd() {
		return dd;
	}
	/**
	 * @param dd the dd to set
	 */
	public void setDd(int dd) {
		this.dd = dd;
	}
	/**
	 * @return the mm
	 */
	public int getMm() {
		return mm;
	}
	/**
	 * @param mm the mm to set
	 */
	public void setMm(int mm) {
		this.mm = mm;
	}
	/**
	 * @return the yyyy
	 */
	public int getYyyy() {
		return yyyy;
	}
	/**
	 * @param yyyy the yyyy to set
	 */
	public void setYyyy(int yyyy) {
		this.yyyy = yyyy;
	}
	

}
