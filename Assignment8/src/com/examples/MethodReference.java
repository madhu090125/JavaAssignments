package com.examples;

@FunctionalInterface
interface Calculator{
	void add(int a , int b);
}

class CalC{
	public static void addSome(int a , int b) {
		System.out.println("The addition of "+a+" and "+b+" is: "+(a+b));
	}
	
	public void letsAdd(int a , int b){
		System.out.println("The addition of "+a+" and "+b+" is "+(a+b));
	}
}

@FunctionalInterface
interface Messenger{
	Message getMessage(String msg);
}
class Message{
	Message(String msg){
		System.out.println("<<<<<Message is: "+msg);
		
	}
}

public class MethodReference {
	public static void main(String [] args) {
		
		//CalC.addSome(5, 6);
		
		//1. Static method Reference
		//Calculator cref = CalC::addSome;   //Method Reference
		//cref.add(15, 12);
		
		//2. Non-Static method Reference
		//CalC calc = new CalC();            //Method Reference
		//Calculator cref = calc::letsAdd;
		//cref.add(12, 12);
		
		//3. Instance method Reference
		Messenger mref = Message::new;       //Method Reference
		mref.getMessage("Hello all>>>>>");
		
	}

	

	}


