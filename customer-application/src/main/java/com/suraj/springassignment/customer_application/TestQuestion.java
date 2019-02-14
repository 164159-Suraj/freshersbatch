package com.suraj.springassignment.customer_application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestQuestion {

	public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("question.xml");
	Question ques=(Question)context.getBean("question");
	ques.getAns();
	}

}
