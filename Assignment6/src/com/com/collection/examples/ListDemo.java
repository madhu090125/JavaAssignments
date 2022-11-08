package com.com.collection.examples;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

class Student{
	int rollno;
	String name;
}

public class ListDemo {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.name =  "Mena";
		s1.rollno = 01;
		
		//List1 contains only string values                    
		//ArrayList<String> list1= new ArrayList<String>();           //type specific
		LinkedList<String> list1= new LinkedList<String>();
		//List2 can store any type of values
		ArrayList list2= new ArrayList();                          // Any type
		
		//1.Add datas in list1
		list1.add("Madhu");
		list1.add("Meera");
		list1.add("Mithra");
		list1.add("Janu");
		list1.add("Jena");
		//list1.add(20);
		
		//Adding datas in list2
		list2.add("Hi");
		list2.add(20);
		list2.add(2.20);
		list2.add(s1);
        list2.add(true);
		 
        //2.Print the reference list -> print the elements in the list in the order we added them
        System.out.println("List1 is : "+list1 );
        System.out.println("List2 is : "+list2 );
        
        //3.getting the specific element in the list
        String names = list1.get(3);
        System.out.println("The name is: "+names);
        
        Object o = list2.get(2);
        System.out.println("The element is: "+o);
        
        //4.Updating the element in the list
        list1.set(2, "leela");
        System.out.println("List now is: "+list1);
        
        //5.Remove an element from the list
        list1.remove(2);
        System.out.println("List after removing an element: "+list1);
        
        //6.Remove all the element -> list1.clear()
        
        //7.Searching in the list
        if(list1.contains("Madhu")) {                 //contains() used to check whether the given element is present in the list or not
        	System.out.println("Madhu is an element of list1");
        }
        
        //7.Iterate the list 
        System.out.println("-----Iterating the list with Enchanced for loop-----");
        for(String str :  list1) {          //enhanced for loop
        	System.out.println(str);
        }
        System.out.println("----------------------------------------------------");
        
        //8.Iterating with Iterator
        Iterator<String> itr = list1.iterator();
        /*System.out.println(itr.next());                  //next() used to print the next element
        System.out.println(itr.next());
        System.out.println(itr.next());
        System.out.println(itr.next());*/
       
        
        //9.Using the loop for iterators
        while(itr.hasNext()) {
        	String strn = itr.next();
        	System.out.println(strn);
        	 if(strn.equals("Meera")) {
         		itr.remove();
         	}       	
        }
        System.out.println("--------------------------------------------------------");
        System.out.println("List after removing the elementis: "+list1);

	}

}
