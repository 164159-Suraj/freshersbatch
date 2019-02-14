package com.SURAJ.oops;

public class Labour extends Employee{
private	double WorkTime;
private	double Salary;
private double BaseTime=10;
public Labour(double worktime,double salary){
	this.WorkTime=worktime;
	this.Salary=salary;
}
double diff;
	@Override
	public void TotalSalary(double salary) {
		if(WorkTime>BaseTime){
			diff=(WorkTime-BaseTime)*100;
		   System.out.println(salary+diff);	
		}
		else
			System.out.println(salary);
		
	}

	

}
