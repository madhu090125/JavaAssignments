package com.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		// HashSet,LinkedHashSet,TreeSet
		
	HashSet<String> set = new HashSet<>();
	//	TreeSet<String> set = new TreeSet<>();
	 // LinkedHashSet<String> set = new LinkedHashSet<>();
	    
		// Here data is not added in indexing
		// Here elements get hashcode while getting added
		set.add("Hello");
		set.add("Aila");
		set.add("Heheee");
		set.add("Elango");
		set.add("Hello");
		set.add("Hi");
		
		//Data is unique,no reductancy
		//Data is unordered due to hashing
		
		System.out.println("Set is:"+set);
		
        //No index so loops cannot be give normally
		Iterator<String> itr = set.iterator();     //Hence Iterator is used to loop
		
		while(itr.hasNext()) {
			String str = itr.next();
			System.out.println(str);
			
		}
		if(set.contains("Heheee")) {
			System.out.println("Element is present");
			
		}
		set.remove("Hello");
		System.out.println("Now the set is:"+set);
		System.out.println("Size of the set is: "+set.size());
	}

}
