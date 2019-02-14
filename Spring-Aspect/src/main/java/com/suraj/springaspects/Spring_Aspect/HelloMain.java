package com.suraj.springaspects.Spring_Aspect;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.suraj.service.ServiceHello;

public class HelloMain {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("hello.xml");
		ServiceHello obj= ctx.getBean("ServiceHello" ,ServiceHello.class);
		//System.out.println(obj);
		System.out.println(obj.getHello().getName());
	}

}
