package com.suraj.test;
import org.junit.*;
import com.suraj.services.DateDifferenceProvide;
import com.suraj.services.supp.MyDate;
import com.suraj.services.supp.MyTestRecord;

public class TestDateDifferenceProvider {
	public static void main(String[] args) {
		
	
MyTestRecord myTestRecord[]=new MyTestRecord[15];
//myTestRecord[0]=new MyTestRecord(new MyDate(4,6,2011),new MyDate(4,6,2011),0);
//myTestRecord[0]=new MyTestRecord(new MyDate(6,4,2011),new MyDate(18,4,2011),-12);
//myTestRecord[0]=new MyTestRecord(new MyDate(6,4,2011),new MyDate(18,5,2011),-42);
//myTestRecord[0]=new MyTestRecord(new MyDate(6,4,2011),new MyDate(18,6,2011),-73);
//myTestRecord[0]=new MyTestRecord(new MyDate(6,4,2011),new MyDate(18,12,2011),-256);
//myTestRecord[0]=new MyTestRecord(new MyDate(6,4,2011),new MyDate(18,12,2012),-622);
//myTestRecord[0]=new MyTestRecord(new MyDate(6,4,2011),new MyDate(18,12,2013),-987);
//myTestRecord[0]=new MyTestRecord(new MyDate(6,4,2011),new MyDate(18,12,2113),-37511);
//myTestRecord[0]=new MyTestRecord(new MyDate(6,4,2011),new MyDate(18,12,2413),-147084);
//myTestRecord[0]=new MyTestRecord(new MyDate(6,4,2011),new MyDate(18,12,2813),-293181);
//myTestRecord[0]=new MyTestRecord(new MyDate(6,1,2011),new MyDate(6,3,2011),-59);
myTestRecord[0]=new MyTestRecord(new MyDate(6,1,2012),new MyDate(6,3,2012),-60);
//myTestRecord[1]=new MyTestRecord(new MyDate(6,2,2012),new MyDate(6,3,2012),-29);
//myTestRecord[2]=new MyTestRecord(new MyDate(22,1,2012),new MyDate(15,11,2012),-298);
//myTestRecord[3]=new MyTestRecord(new MyDate(6,2,2012),new MyDate(6,12,2012),-304);

int CalcDiff=DateDifferenceProvide.getDateDiffrence(MyTestRecord.getStartDate(),MyTestRecord.getEndDate());
System.out.println(CalcDiff);
System.out.println(MyTestRecord.getActualDifference());
 /* @Test
  MyTestRecord m1=new MyTestRecord(MyTestRecord.getStartDate(),MyTestRecord.getEndDate(),-60);
  Assert.assertEquals(CalcDiff,MyTestRecord.getActualDifference());*/

/*if (CalcDiff==MyTestRecord.getActualDifference()){
	System.out.println("test case Passed!");
	}
else
	System.err.println("test case failed");*/


}
}
