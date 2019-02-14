package com.suraj.generics;

public class TestMyList {

	public static void main(String[] args) {
		MyList<Employee> emp=new MyList<Employee>();
		emp.add(new Employee("Suraj",101,22));
		emp.Listadd();
		emp.add(new Employee("abc",102,25));
		emp.Listadd();
		emp.add(new Employee("Su",103,24));
		emp.Listadd();
		System.out.println(emp.get2());
		
		//System.out.println("The Employee Details are:"+" "+emp.get1());

		/*MyList<AccountHolder> acc= new MyList<AccountHolder>();
		acc.add(new AccountHolder("Suraj",15000));
		System.out.println("The Account_Holder Details are:"+" "+acc.get1());*/
	}

}
