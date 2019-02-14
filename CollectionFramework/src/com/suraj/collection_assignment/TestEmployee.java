package com.suraj.collection_assignment;
import java.util.Map;
import java.util.HashMap;
public class TestEmployee {

	public static void main(String[] args) {
	    //Map<Employee, String> m = new HashMap<Employee, String>();
	    //System.out.println(m.get(new Employee(100)));
/*		Employee employee=new Employee(100);
		int res=employee.hashCode();
        System.out.println(res);
        System.out.println(employee.equals(employee));
        
    	Employee employee1=new Employee(200);
		int res1=employee1.hashCode();
        System.out.println(res1);
        System.out.println(employee.equals(employee1));*/
		HashMap<Employee,Integer> hash=new HashMap<>();
		Employee employee1=new Employee("Suraj",565);
		Employee employee2=new Employee("Suraj",775);
		//System.out.println(hash.put(new Employee("Suraj",100), 546).hashCode());
		hash.put(employee1, 500);
		hash.put(employee2, 5000);
		System.out.println(employee1.hashCode());
		System.out.println(employee2.hashCode());
		System.out.println(employee1.equals(employee2));
	}

}
