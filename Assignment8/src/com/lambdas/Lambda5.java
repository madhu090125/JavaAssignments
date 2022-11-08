package com.lambdas;

import java.util.ArrayList;
import java.util.Arrays;

public class Lambda5 {

	public static void main(String[] args) {
		 ArrayList<String>list=new ArrayList<>(Arrays.asList("hello","good","bye"));
	        list.removeIf(word->word.length()%2==0);
	        System.out.println(list);
	        
	    

	}

}
