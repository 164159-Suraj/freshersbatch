package com.suraj.bank;

public class CurrentAccountver2 extends CurrentAccount implements Insurance{

	@Override
	public String getInsuranceName() {
		// TODO Auto-generated method stub
		return "LIC";
	}

	@Override
	public double getInsuranceAmount() {
		// TODO Auto-generated method stub
		return 5_00_000;
	}

}
