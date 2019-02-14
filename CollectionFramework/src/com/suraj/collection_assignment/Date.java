package com.suraj.collection_assignment;
//import java.util.Comparator;

public class Date  {
	
	
	
	/**
	 * @return the day
	 */
	public int getDay() {
		return day;
	}

	/**
	 * @param day the day to set
	 */
	public void setDay(int day) {
		this.day = day;
	}

	/**
	 * @return the month
	 */
	public int getMonth() {
		return month;
	}

	/**
	 * @param month the month to set
	 */
	public void setMonth(int month) {
		this.month = month;
	}

	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}

	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}

	int day,month,year;
	public Date(int day,int month,int year){
		this.day=day;
		this.month=month;
		this.year=year;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	
	@Override
	public String toString() {
		
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
	
	
	public int get(Date d){
		if(day==d.day && month==d.month && year!=d.year){
			
			return 1;
		}
		
		return 0;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + day;
		result = prime * result + month;
		return result;
	}
}