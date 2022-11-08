package com.examples;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Exercise2 {

	public static void main(String[] args) {
		List<Persons>l1 = Arrays.asList(
				new Persons ("AppleIphone","Completed",40000),
				new Persons ("HpLaptop","Accepted",12000),
				new Persons ("TV","Completed",6000),
				new Persons ("Refrigirator","Accepted",15000),
				new Persons ("Fan","Recieved",2000),
				new Persons ("Grinder","Not Received",1500)
				);
		// 1. Sort the list by last name
		Collections.sort(l1, (p1,p2)->p2.getlastName().compareTo(p1.getlastName()));		
		// 2. Create a method that prints all the methods on the list
		printLastNameBeginningWithC(l1,p->true);

	}
	private static void printLastNameBeginningWithC(List<Persons> l1 ,Condition1 condition) {
		for(Persons p : l1) {
			if(p.getAge()>30) {
				System.out.println(p);
			}
			
		}
}
}
interface Condition1{
	boolean check(Persons p);
}
