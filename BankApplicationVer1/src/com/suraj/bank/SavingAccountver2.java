package com.suraj.bank;

public class SavingAccountver2 extends SavingsAccount implements Insurance{

	@Override
	public String getInsuranceName() {
		// TODO Auto-generated method stub
		return "Jivan Bima";
	}

	@Override
	public double getInsuranceAmount() {
		// TODO Auto-generated method stub
		return 5_00_000;
	}

}
