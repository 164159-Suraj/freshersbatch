package com.SURAJ.oops;

public class TestSalary {
	
	public static void Test()
	{
	Manager M1=new Manager("Suraj",101);
	M1.TotalSalary(50000);
	Labour L1=new Labour(15,30000);
	L1.TotalSalary(30000);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Test();
	}

}
