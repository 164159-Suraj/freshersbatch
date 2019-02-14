package com.suraj.services;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Assert;

import com.suraj.services.DateDifferenceProvide;
import com.suraj.services.supp.MyDate;
import com.suraj.services.supp.MyTestRecord;

public class TestUnitTesting {
	MyTestRecord myTestRecord[]=new MyTestRecord[15];
	static int num;
	@BeforeClass
	public static void printbefore() {
		System.out.println("Hi");
		num = 1;
	}
	
	@Before
	public void init() {
		
		System.out.println("Test case Passed"+" "+ num++);
	}
	@AfterClass
	public static void printAfter() {
		System.out.println("Bye");
	}
	
	
	
	@Test
	  public void testDifference1(){
		myTestRecord[0]=new MyTestRecord(new MyDate(4,6,2011),new MyDate(4,6,2011),0);
		int CalcDiff=DateDifferenceProvide.getDateDiffrence(MyTestRecord.getStartDate(),MyTestRecord.getEndDate());
		Assert.assertEquals(0, CalcDiff, 0);
	}
	
	
	
	@Test
	  public void testDifference2(){
		myTestRecord[0]=new MyTestRecord(new MyDate(6,4,2011),new MyDate(18,4,2011),-12);
		int CalcDiff=DateDifferenceProvide.getDateDiffrence(MyTestRecord.getStartDate(),MyTestRecord.getEndDate());
		Assert.assertEquals(-12, CalcDiff, 0);
	}
	
	
	
	@Test
	  public void testDifference3(){
		myTestRecord[0]=new MyTestRecord(new MyDate(6,4,2011),new MyDate(18,5,2011),-42);
		int CalcDiff=DateDifferenceProvide.getDateDiffrence(MyTestRecord.getStartDate(),MyTestRecord.getEndDate());
		Assert.assertEquals(-42, CalcDiff, 0);
	}

	
	
	@Test
	  public void testDifference4(){
		myTestRecord[0]=new MyTestRecord(new MyDate(6,4,2011),new MyDate(18,6,2011),-73);
		int CalcDiff=DateDifferenceProvide.getDateDiffrence(MyTestRecord.getStartDate(),MyTestRecord.getEndDate());
		Assert.assertEquals(-73, CalcDiff, 0);
	}
	
	
	
	@Test
	  public void testDifference5(){
		myTestRecord[0]=new MyTestRecord(new MyDate(6,4,2011),new MyDate(18,12,2011),-256);
		int CalcDiff=DateDifferenceProvide.getDateDiffrence(MyTestRecord.getStartDate(),MyTestRecord.getEndDate());
		Assert.assertEquals(-256, CalcDiff, 0);
	}
	
	
	
	@Test
	  public void testDifference6(){
		myTestRecord[0]=new MyTestRecord(new MyDate(6,4,2011),new MyDate(18,12,2012),-622);
		int CalcDiff=DateDifferenceProvide.getDateDiffrence(MyTestRecord.getStartDate(),MyTestRecord.getEndDate());
		Assert.assertEquals(-622, CalcDiff, 0);
	}
	
	
	
	@Test
	  public void testDifference7(){
		myTestRecord[0]=new MyTestRecord(new MyDate(6,4,2011),new MyDate(18,12,2013),-987);
		int CalcDiff=DateDifferenceProvide.getDateDiffrence(MyTestRecord.getStartDate(),MyTestRecord.getEndDate());
		Assert.assertEquals(-987, CalcDiff, 0);
	}
	
	
	
	@Test
	  public void testDifference8(){
		myTestRecord[0]=new MyTestRecord(new MyDate(6,4,2011),new MyDate(18,12,2113),-37511);
		int CalcDiff=DateDifferenceProvide.getDateDiffrence(MyTestRecord.getStartDate(),MyTestRecord.getEndDate());
		Assert.assertEquals(-37511, CalcDiff, 0);
	}
	
	
	
	@Test
	  public void testDifference9(){
		myTestRecord[0]=new MyTestRecord(new MyDate(6,4,2011),new MyDate(18,12,2413),-147084);
		int CalcDiff=DateDifferenceProvide.getDateDiffrence(MyTestRecord.getStartDate(),MyTestRecord.getEndDate());
		Assert.assertEquals(-147084, CalcDiff, 0);
	}
	
	
	
	@Test
	  public void testDifference10(){
		myTestRecord[0]=new MyTestRecord(new MyDate(6,4,2011),new MyDate(18,12,2813),-293181);
		int CalcDiff=DateDifferenceProvide.getDateDiffrence(MyTestRecord.getStartDate(),MyTestRecord.getEndDate());
		Assert.assertEquals(-293181, CalcDiff, 0);
	}
	
	
	
	@Test
	  public void testDifference11(){
		myTestRecord[0]=new MyTestRecord(new MyDate(6,1,2011),new MyDate(6,3,2011),-59);
		int CalcDiff=DateDifferenceProvide.getDateDiffrence(MyTestRecord.getStartDate(),MyTestRecord.getEndDate());
		Assert.assertEquals(-59, CalcDiff, 0);
	}
	
	
	
	@Test
	  public void testDifference12(){
		myTestRecord[0]=new MyTestRecord(new MyDate(6,1,2012),new MyDate(6,3,2012),-60);
		int CalcDiff=DateDifferenceProvide.getDateDiffrence(MyTestRecord.getStartDate(),MyTestRecord.getEndDate());
		Assert.assertEquals(-60, CalcDiff, 1);
	}
	
	
	
	@Test
	  public void testDifference13(){
		myTestRecord[1]=new MyTestRecord(new MyDate(6,2,2012),new MyDate(6,3,2012),-29);
		int CalcDiff=DateDifferenceProvide.getDateDiffrence(MyTestRecord.getStartDate(),MyTestRecord.getEndDate());
		Assert.assertEquals(-29, CalcDiff, 1);
	}
	
	
	
	@Test
	  public void testDifference14(){
		myTestRecord[2]=new MyTestRecord(new MyDate(22,1,2012),new MyDate(15,11,2012),-298);
		int CalcDiff=DateDifferenceProvide.getDateDiffrence(MyTestRecord.getStartDate(),MyTestRecord.getEndDate());
		Assert.assertEquals(-298, CalcDiff, 1);
	}
	
	
	
	@Test
	  public void testDifference15(){
		myTestRecord[3]=new MyTestRecord(new MyDate(6,2,2012),new MyDate(6,12,2012),-304);
		int CalcDiff=DateDifferenceProvide.getDateDiffrence(MyTestRecord.getStartDate(),MyTestRecord.getEndDate());
		Assert.assertEquals(-304, CalcDiff, 1);
	}
	
}
