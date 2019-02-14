package com.suraj.services;
import org.junit.*;
import com.suraj.services.supp.MyDate;

public class DateDifferenceProvide {
	static int months[]={31,28,31,30,31,30,31,31,30,31,30,31};
	static int numberOfLeapYears1,numberOfLeapYears2,date1,date2 ;
	static int totalDays1,totalDays2,totalDays,result,sumOfMonths=0;
	public static int getDateDiffrence(MyDate startDate, MyDate endDate){
		//return ((startDate.getDd()-endDate.getDd())+(startDate.getMm()-endDate.getMm())+(startDate.getYyyy()-endDate.getYyyy()));
		totalDays1=days1(startDate);
		totalDays2=days2(endDate);
		result=totalDays1-totalDays2;
		return result;
	}

		public static int days1(MyDate startDate){
			sumOfMonths=0;
			for(int index=0;index<startDate.getMm()-1;index++){
				sumOfMonths+=months[index];
			}
			if(startDate.getYyyy()%4==0&&startDate.getYyyy()%100==0||startDate.getYyyy()%400==0){
		    		 date1=startDate.getYyyy()-1;
		    		 numberOfLeapYears1=date1/4-date1/100+date1/400;
		    		
		    		 totalDays=startDate.getDd()+sumOfMonths+(365*startDate.getYyyy())+numberOfLeapYears1+1;
		    		 return totalDays;
		    	}
			else{
				    date2=startDate.getYyyy();
		    		numberOfLeapYears2=date2/4-date2/100+date2/400;
		    		
		    		totalDays=startDate.getDd()+sumOfMonths+(365*startDate.getYyyy())+numberOfLeapYears2;
		    		return totalDays;
		    	}
			
			
		}
		public static int days2(MyDate endDate){
			sumOfMonths=0;
			for(int index=0;index<endDate.getMm()-1;index++){
				sumOfMonths+=months[index];
			}
			if(endDate.getYyyy()%4==0&&endDate.getYyyy()%100==0||endDate.getYyyy()%400==0){
		    		 date1=endDate.getYyyy()-1;
		    		 numberOfLeapYears1=date1/4-date1/100+date1/400;
		    		
		    		 totalDays=endDate.getDd()+sumOfMonths+(365*endDate.getYyyy())+numberOfLeapYears1+1;
		    		 return totalDays;
		    	}
			else{
				    date2=endDate.getYyyy();
		    		numberOfLeapYears2=date2/4-date2/100+date2/400;
		    		
		    		totalDays=endDate.getDd()+sumOfMonths+(365*endDate.getYyyy())+numberOfLeapYears2;
		    		return totalDays;
		    	}
			
			
		}

}
