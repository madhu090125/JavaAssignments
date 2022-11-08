package com.lambdas;

@FunctionalInterface
interface Addition{
	void add(int a , int b);
}

@FunctionalInterface
interface Subraction{
	void sub(int a , int b);
}

@FunctionalInterface
interface Multiplication{
	void mul(int a , int b);
}

@FunctionalInterface
interface Division{
	void div(double a , double b);
}

public class Lambda1 {

	public static void main(String[] args) {
		
		Addition a1 = (a,b)->{
			System.out.println("Addition of "+a+" and "+b+" is: "+(a+b));
		};
		a1.add(12, 1);
		
		Subraction s1 = (a,b)->{
			System.out.println("Addition of "+a+" and "+b+" is: "+(a-b));
		};
		s1.sub(12, 1);
		
		Multiplication m1 = (a,b)->{
			System.out.println("Addition of "+a+" and "+b+" is: "+(a*b));
		};
		m1.mul(12, 1);
		
		Division d1 = (a,b)->{
			System.out.println("Addition of "+a+" and "+b+" is: "+(a/b));
		};
		d1.div(25, 5);




	}

}
