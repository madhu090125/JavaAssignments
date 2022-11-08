package com.lambdas;

import java.util.ArrayList;
import java.util.Arrays;

public class Lambda4 {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>(Arrays.asList("hello","good","bye"));
        StringBuilder sb = new StringBuilder();
        list.forEach(word->sb.append(word.charAt(0)));
        String result= sb.toString();
        System.out.println(result);
        

	}

}
