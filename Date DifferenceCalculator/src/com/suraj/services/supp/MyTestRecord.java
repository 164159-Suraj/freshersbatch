package com.suraj.services.supp;
import org.junit.*;
public class MyTestRecord {
static MyDate startDate;
static MyDate endDate;
public static int ActualDifference;
public  MyTestRecord(MyDate startDate, MyDate endDate, int ActualDifference) {
	super();
	this.startDate = startDate;
	this.endDate = endDate;
	this.ActualDifference = ActualDifference;
}

/**
 * @return the startDate
 */
public static MyDate getStartDate() {
	return startDate;
}
/**
 * @param startDate the startDate to set
 */
public void setStartDate(MyDate startDate) {
	this.startDate = startDate;
}
/**
 * @return the endDate
 */
public static MyDate getEndDate() {
	return endDate;
}
/**
 * @param endDate the endDate to set
 */
public void setEndDate(MyDate endDate) {
	this.endDate = endDate;
}
/**
 * @return the actualDifference
 */
public static int getActualDifference() {
	return ActualDifference;
}
/**
 * @param actualDifference the actualDifference to set
 */
public void setActualDifference(int actualDifference) {
	ActualDifference = actualDifference;
}

}
