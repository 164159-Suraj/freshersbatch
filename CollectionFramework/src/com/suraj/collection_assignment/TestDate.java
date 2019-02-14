package com.suraj.collection_assignment;

import java.util.HashMap;
import java.util.Map;


public class TestDate {

	public static void main(String[] args) {

		Map<Date, String> ht1 = new HashMap<Date, String>();

		Date d1 = new Date(15, 6, 2015);
		Date d2 = new Date(15, 2, 2012);
		Date d3 = new Date(25, 3, 2013);
		Date d4 = new Date(24, 6, 2014);
		Date d5 = new Date(15, 5, 2016);

		ht1.put(d1, "Suraj");
		ht1.put(d2, "Sanjay");
		ht1.put(d3, "Rahul");
		ht1.put(d4, "Akash");
		ht1.put(d5, "varun");

		for (Map.Entry<Date, String> index : ht1.entrySet()) {
			int a = d1.get(index.getKey());
			if (a == 1) {
				System.out
						.println("Compilation fails -----Please enter a unique date!!!");
				break;
			} else {
				System.out.println("Key = " + index.getKey() + ", Value = "
						+ index.getValue());
			}
		}

	}
}