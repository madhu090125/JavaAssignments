package com.classes;

public class SingleTone {
	  private static SingleTone singleton = new SingleTone();
	  
	  public static SingleTone getInstance() {
		  return singleton;
	  }
	  
	  private SingleTone() {}
	  
	  protected void show() {
		  System.out.println("This is a Singleton Class. Only one instance can be created at a time.");
	  }
	  public static void main(String args[]) {
		  SingleTone obj = SingleTone.getInstance(); 
		  obj.show();
			
		}

	}



