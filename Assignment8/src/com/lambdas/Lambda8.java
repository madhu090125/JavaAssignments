package com.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Lambda8 {

	public static void main(String[] args) {
		List<Orders>o1 = Arrays.asList(
				new Orders ("AppleIphone","Completed",40000),
				new Orders ("HpLaptop","Accepted",12000),
				new Orders ("TV","Completed",6000),
				new Orders ("Refrigirator","Accepted",15000),
				new Orders ("Fan","Recieved",2000),
				new Orders ("Grinder","Not Received",1500)
				);
		Thread t1 = new Thread(()-> System.out.println(o1));
		t1.start();
		
	}
	private static void PrintOrderStatus(List<Orders> o1,Consumer<Orders>consumer) {
		for(Orders o : o1) {
	 {
				consumer.accept(o);;
			}
		}		
	}
}
