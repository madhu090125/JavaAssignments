package com.examples;

public class RunnableExample {

	public static void main(String[] args) {
		Thread mynew = new Thread(()->System.out.println("My thread is running"));
		mynew.run();
		
		Displayable  greetingMethod =()->System.out.println("Hello");
		

	}

}
interface Greeting
{
	void hello();
	}