package io.java.brains;

public class MyLambda implements Addition {

	@Override
	public int addition(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

/*	public static void main(String[] args) {
		addFunction addition=(int a,int b)-> a+b;
		printFunction printing=(String s)->System.out.println(s);
		System.out.println(addition.add(5,6));
		printing.print("Suraj");
		
	
	
	}*/
	
	
	

	interface addFunction{
		public int add(int a,int b);
	}
	
	
	interface printFunction{
		public void print(String s);
	}

}
