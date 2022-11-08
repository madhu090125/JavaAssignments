package com.lambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.function.Predicate;

import com.examples.Persons;

public class Lambda2 {

	public static void main(String[] args) {
		List<Orders>o1 = Arrays.asList(
				new Orders ("AppleIphone","Completed",40000),
				new Orders ("HpLaptop","Accepted",12000),
				new Orders ("TV","Completed",6000),
				new Orders ("Refrigirator","Accepted",15000),
				new Orders ("Fan","Recieved",2000),
				new Orders ("Grinder","Not Received",1500)
				);
		
		Collections.sort(o1, (obj1,obj2)->obj2.getStatus().compareTo(obj1.getStatus()));
		System.out.println("<<<<<<<<<<<<<<<<Entire List>>>>>>>>>>>>>>>>");
		PrintOrderStatus(o1,o->true);
		System.out.println("--------------------------Order Status of Completed-----------------------");
		PrintOrderStatus(o1,o->(o.getStatus().startsWith("C"))||(o.getStatus().startsWith("A")));
		System.out.println("--------------------------Order Price Greater than 10000------------------");
		PrintOrderStatus(o1,o->o.getPrice()>10000);
		
	}

	private static void PrintOrderStatus(List<Orders> o1,Predicate<Orders> predicate) {
		for(Orders o : o1) {
			if(predicate.test(o)) {
				System.out.println(o);
			}
		}		
	}

	
}

