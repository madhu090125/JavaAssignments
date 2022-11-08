package com.lambdas;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Lambda7 {
	

	public static void main(String[] args) {
		HashMap<Integer,String> fruits = new HashMap<>();
		fruits.put(1, "apple");
		fruits.put(6, "apple");
		fruits.put(9, "banana");
		fruits.put(3, "radish");
		Iterator<Integer> it = fruits.keySet().iterator();
		StringBuilder sb = new StringBuilder();
		/*
		 * while(it.hasNext()) { int key = it.next(); System.out.println(key); }
		 */
		for(Integer no : fruits.keySet()) {
			System.out.println(sb.append(fruits));
			sb.deleteCharAt(sb.length());
			

		}
			}

}