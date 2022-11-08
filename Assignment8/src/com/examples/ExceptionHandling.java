package com.examples;

import java.util.function.BiConsumer;

public class ExceptionHandling {

	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5};
		int key = 0;
		
		
		process(arr,key,(v,k)->System.out.println(v/k));

	}

	private static void process(int[] arr, int key, BiConsumer<Integer,Integer> consumer) {
		for(int i : arr) {
			consumer.accept(i, key);
		}
		
	}

}
