package io.java.brains;

public class Test {

	public static void main(String[] args) {
		
		//using object
		MyLambda obj1=new MyLambda();
		System.out.println(obj1.addition(5, 6));
		
		//using lambda-----(Lambda function doesn't belongs to a class,it can be treated as a value)
        Addition addFunction=(int a,int b)-> a+b;
        System.out.println(addFunction.addition(5, 6));
	}

}
