package com.com.collection.examples;

import java.util.HashMap;

import java.util.Map;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		//HashMap<String,String> fruits = new HashMap<>();
		TreeMap<String,String> fruits = new TreeMap<>();
		fruits.put("red", "apple");
		fruits.put("green", "apple");
		fruits.put("yellow", "banana");
		fruits.put("white", "radish");
		
		//Map cannot be traversed
		// So it has to be converted to set by using keyset() or entryset()
	/*	System.out.println("Size of the map is: "+fruits.size());
		System.out.println(fruits.containsKey("green"));
		System.out.println(fruits.containsValue("banana")); */
	     
		System.out.println("---------------------Values using loop--------------------");
		 for(Map.Entry pairvalue:fruits.entrySet()){
			System.out.println(pairvalue.getKey()+" : "+ pairvalue.getValue());
		}
		System.out.println("----------------------------------------------------------");
		 
	/*	fruits.remove("green", "apple");
		System.out.println("Size of the array now is:"+fruits.size());  */
		
		

	}

}
