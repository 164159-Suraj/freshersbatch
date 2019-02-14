package com.SURAJ.oops;

public abstract class Employee {
	String EmpName;
	double Salary;
	int EmpId;
	public Employee(){
		
	}
public Employee(String Ename,int Id){
		this.EmpName=Ename;
		this.EmpId=Id;
		System.out.println("Employee name is "+Ename + " and id is "+Id);
	}

	/**
 * @return the salary
 */
public double getSalary() {
	return Salary;
}

/**
 * @param salary the salary to set
 */
public void setSalary(double salary) {
	Salary = salary;
}

/**
 * @return the empId
 */
public int getEmpId() {
	return EmpId;
}

/**
 * @param empId the empId to set
 */
public void setEmpId(int empId) {
	EmpId = empId;
}

//Method to CalculateTotalSalary
public abstract void TotalSalary(double salary);


	/**
	 * @return the empName
	 */
	public String getEmpName() {
		return EmpName;
	}


	/**
	 * @param empName the empName to set
	 */
	public void setEmpName(String empName) {
		EmpName = empName;
	}





}
