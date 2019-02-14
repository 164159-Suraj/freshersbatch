package com.SURAJ.oops;

public class Manager extends Employee {
	
	public Manager(String Ename,int Id)
	{
		super(Ename,Id);
	}

private double insentive=20000;
	@Override
	public void TotalSalary(double salary) {
		double totalSal=salary+insentive;
		System.out.println(totalSal);
		
	}

}
