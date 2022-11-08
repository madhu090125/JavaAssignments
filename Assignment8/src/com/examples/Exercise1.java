package com.examples;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Exercise1 {

	public static void main(String[] args) {
		List<Persons>l1 = Arrays.asList(
				new Persons ("Madhu","Sree",20),
				new Persons ("Meera","Nandhakumar",12),
				new Persons ("Harshitha","Rajmohan",60),
				new Persons ("Areja","Parwin",29),
				new Persons ("Shravani","Pani",50),
				new Persons ("Priya","Mohan",56)
				);
		// 1. Sort the list by last name
		Collections.sort(l1, (p1,p2)->p2.getlastName().compareTo(p1.getlastName()));		
		// 2. Create a method that prints all the methods on the list
		//printAll(l1);
		printLastNameBeginningWithC(l1,p->true);
		
		// 3. Create a method that prints all the peoples last name that starts with P
	}



	private static void printLastNameBeginningWithC(List<Persons> l1 ,Condition condition) {
		for(Persons p : l1) {
			if(p.getlastName().startsWith("P")) {
				System.out.println(p);
			}
			
		}
	}
	

	/*
	 * private static void printAll(List<Persons> l1) { for(Persons p : l1) {
	 * System.out.println(p); }
	 * 
	 * }
	 */
}
interface Condition{
	boolean check(Persons p);
}
