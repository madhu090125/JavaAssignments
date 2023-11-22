package com.java.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionsDemo {

	public static void main(String[] args) {
		List<Integer> listOfIntegers = new ArrayList<>();
		listOfIntegers.add(12);
		listOfIntegers.add(3);
		listOfIntegers.add(22);
		listOfIntegers.add(9);
		listOfIntegers.add(54);
		
		System.out.println(listOfIntegers);
		
		for(int i : listOfIntegers) {
			System.out.println(i);
		}
		
		System.out.println(listOfIntegers.isEmpty());
		
		Set<Integer> setOfIntegers = new HashSet<>();
		setOfIntegers.add(12);
		setOfIntegers.add(3);
		setOfIntegers.add(3);
		setOfIntegers.add(12);
		setOfIntegers.add(9);
		
		System.out.println(setOfIntegers);
		
		for(int i: setOfIntegers) {
			System.out.println(i);
		}
		
		System.out.println(setOfIntegers.remove(12));

//		System.out.println(setOfIntegers);
		
		Map<String, Integer> mapOfMarksTable = new HashMap<>();
		
		mapOfMarksTable.put("Madhu", 34);
		mapOfMarksTable.put("Meenu", 87);
		mapOfMarksTable.put("lily", 54);
		mapOfMarksTable.put("leo", 67);
		mapOfMarksTable.put("lucas", 45);
		
		System.out.println(mapOfMarksTable);
		
		System.out.println(mapOfMarksTable.values());
		
		for(String s: mapOfMarksTable.keySet()) {
			System.out.println(s + " : " + mapOfMarksTable.get(s) );
		}

		
	}

}
