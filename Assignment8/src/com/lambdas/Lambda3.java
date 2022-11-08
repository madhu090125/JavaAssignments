package com.lambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/*class Product {
	  private double price = 0.0;

	  public void setPrice(double price) {
	    this.price = price;
	  }

	  public void printPrice() {
	    System.out.println(price);
	  }
	}*/

public class Lambda3 {

	public static void main(String[] args) {
		List<Orders>o1 = Arrays.asList(
				new Orders ("AppleIphone","Completed",40000),
				new Orders ("HpLaptop","Accepted",12000),
				new Orders ("TV","Completed",6000),
				new Orders ("Refrigirator","Accepted",15000),
				new Orders ("Fan","Recieved",2000),
				new Orders ("Grinder","Not Received",1500)
				);
		Collections.sort(o1, (obj1,obj2)->obj2.getStatus().compareTo(obj1.getStatus()));
		PrintOrderStatus(o1,o->true,o->System.out.println(o));
		
		  //Function 
		  int n = 5; modifyValue(n, cal->cal + 10); modifyValue(n, val-> val* 100);
		  
		  //Supplier 
		  int a = 3; display(() -> a + 10); display(() -> a + 100);
		  
		 
	}
	private static void PrintOrderStatus(List<Orders> o1,Predicate<Orders> predicate,Consumer<Orders> consumer) {
		for(Orders o : o1) {
			if(predicate.test(o)) {
				consumer.accept(o);;
			}
		}		
	}
	  static void display(Supplier<Integer> arg) { 
		  System.out.println(arg.get()); 
		  }
	  
	  static void modifyValue(int v, Function<Integer, Integer> obj){ 
		  int result = obj.apply(v);
		  System.out.println(result); 
		  }
	 


}
