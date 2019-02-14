package com.suraj.springassignment.customer_application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCustomer {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"spring.xml");

		Customer customer = (Customer) context.getBean("customer");
		customer.getCustomerDetails();

	}

}
