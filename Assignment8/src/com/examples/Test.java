package com.examples;

class Test implements Displayable {
	public void display(String msg) {
		System.out.println(msg);
	}
public static void main(String [] args) {
	Test ts = new Test();
	ts.display("hello");
	
}
@Override
public void display() {
	// TODO Auto-generated method stub
	
}
}
