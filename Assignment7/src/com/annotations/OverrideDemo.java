package com.annotations;

import java.util.ArrayList;

@FunctionalInterface               
/*This interface is used to set the interface functional which means only 1 method it can hold
 *This annotation is introduced in java version 1.5 
 * 
 * */
interface Hello {
	
	 void display();
	 
	/*public static void get() {
		
	}*/
}

class A{
	public void showMyDataBase() {
		System.out.println("A");
	}
}

class B extends A{
	@Deprecated
	public void  show() {
		System.out.println("Hi");
	}
	@Override
	@SuppressWarnings("unchecked")
	public void showMyDataBase() {
		ArrayList<Integer> arr = new ArrayList<>();
		System.out.println("B");
	}
	
}

public class OverrideDemo {

	public static void main(String[] args) {
		B obj = new B();
		obj.showMyDataBase();
		obj.show();
	
	}

}
