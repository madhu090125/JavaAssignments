package com.examples;

@FunctionalInterface
interface Cab{                      //Interface contain exactly one abstract method
	
	//void bookcab()
	
	//void bookcab(String source, String destination);                 // by default it is public abstract void bookcab()
	
	double bookcab(String source, String destination); 
	
}

/*class Uberx implements Cab{
	public void bookcab() {
		System.out.println("Your cab has been booked");
	}
	
}*/

public class Example1  {
	int insvar = 120;
	static int svar = 130;
	
	public static void main(String[] args) {
		
		
		//1.
		//Cab cab = new Cab();    //Polymorphism
		//cab.bookcab();
		
		//2.
		//Anaonymous  Class
		/*Cab cab = new Cab() {			
			@Override
			public void bookcab() {
				System.out.println("Your cab has been booked");
				
			}
		};
		cab.bookcab();*/
		
		//		double fare = cab1.bookcab("Coimbatore","Trichy");
		//System.out.println("Fare for the ride is : " + fare);

	}
	//3.
			//Using lambda expression
			Cab cab1 = (source,destination)->{
				int lvar = 1000;
				System.out.println("You have booked your cab from " +source+ " to " +destination);
				System.out.println("The instance variable is: "+insvar);
				System.out.println("The instance variable is: "+lvar);
				System.out.println("The Static variable is: "+Example1.svar);
				return 120.3;
				
			};


}
