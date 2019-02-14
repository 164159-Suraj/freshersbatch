package com.suraj.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class HelloAspect {
	@Before("execution(public String getName())")
	public void method1(){
		System.out.println("This the Method1");
	}
}
