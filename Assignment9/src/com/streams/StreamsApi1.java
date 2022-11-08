package com.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class StreamsApi1 {

	public static void main(String[] args) {
		List<Fruits>list = Arrays.asList(
				new Fruits("Apple","Red",35,250),
				new Fruits("Pomogranet","Red",26,25),
				new Fruits("Banana","Yellow",10,100),
				new Fruits("Pear","Green",30,20),
				new Fruits("Grapes","Purple",30,150)
				);
		
		//1. Displaying the fruit name which has calories less than 100 
		
		Collections.sort(list, (obj1,obj2)-> obj2.getCalories().compareTo(obj1.getCalories()));
		list.stream()
		.filter(p->p.getCalories()<=100)
		.forEach(p->System.out.println(p.getname()));
		
		//2. Displaying the fruits name sorted by its colour
		
		Collections.sort(list, (obj1,obj2)->obj1.getColour().compareTo(obj2.getColour()));
		list.stream()
		.forEach(p->System.out.println(p.getname()));
		
		//3. Display the fruit name which has colour red and price in ascending order23
		
		Collections.sort(list, (obj1,obj2)->obj1.getPrice().compareTo(obj2.getPrice()));
		list.stream()
		.filter(p->p.getColour().startsWith("R"))
		.forEach(p->System.out.println(p.getname()));
		
	}

}
