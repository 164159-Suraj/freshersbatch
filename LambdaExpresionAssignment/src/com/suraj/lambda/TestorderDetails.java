package com.suraj.lambda;


import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.List;
import java.util.ArrayList;
public class TestorderDetails {

	public static void main(String[] args) {
		
		List<OrderDetails> inputs=new ArrayList<OrderDetails>();
		
		OrderDetails d1=new OrderDetails("Watch",11000.0);
		OrderDetails d2=new OrderDetails("Glass",4000.0);
		OrderDetails d3=new OrderDetails("Jeans",5000.0);
		OrderDetails d4=new OrderDetails("Shirt",2000.0);
		OrderDetails d5=new OrderDetails("Phone",12000.0);
		inputs.add(d1);
		inputs.add(d2);
		inputs.add(d3);
		inputs.add(d4);
		inputs.add(d5);
		
		System.out.println("All Order values are:");
		System.out.println(inputs);
		Consumer<OrderDetails> con=i->{
				if(i.getOrderprice()>10000){
					System.out.println(i+"   "+"    Accepted");
				}
				else{
					System.out.println(i+"   "+"    Not Accepted");
				}
		};
		System.out.println("=======================================================================");
		
	
		
		
		ArrayList<OrderDetails> inputs1=(ArrayList<OrderDetails>) inputs.stream().filter(i->i.getOrderprice()>10000).collect(Collectors.toList());
		System.out.println("Orders with price greater than 10000");
		System.out.println(inputs1);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("All the orders with Status are:");
	      inputs.stream().forEach(con);
		
	}

}
