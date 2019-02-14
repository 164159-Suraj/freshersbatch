package com.suraj.springassignment.customer_application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBankDetails {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("bank.xml");
		BankAccountServiceImpl  obj=(BankAccountServiceImpl)ctx.getBean("service");
		System.out.println(obj.getBalance(123));
		System.out.println(obj.deposit(123, 5000));
		BankAccountepositoryImpl  obj1=(BankAccountepositoryImpl)ctx.getBean("repo");
		System.out.println(obj1.getBalance(456));

	}

}
