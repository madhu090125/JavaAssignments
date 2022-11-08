package com.examples.streams;

import java.util.Arrays;
import java.util.List;



public class StreamsExamples {

	public static void main(String[] args) {
		List<Persons>l1 = Arrays.asList(
				new Persons ("Madhu","Sree",20),
				new Persons ("Meera","Nandhakumar",12),
				new Persons ("Harshitha","Rajmohan",60),
				new Persons ("Areja","Parwin",29),
				new Persons ("Shravani","Pani",50),
				new Persons ("Priya","Mohan",56)
				);
		l1.stream()
		.filter(p->p.getFirstName().startsWith("P"))
		.forEach(p->System.out.println(p.getFirstName()));
		long count =  l1.stream()
		.filter(p->p.getlastName().startsWith("P"))
		.count();
		System.out.println(count);
		

	}

}
