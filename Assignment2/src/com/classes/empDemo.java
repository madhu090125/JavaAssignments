package com.classes;
public class empDemo {
	  public static void main(String arg[]) {
		  Employee e = new Employee(101,"Anu", "Software Associate");
		  e.calSalary();
		  /*Manager m = new Manager(102, "Mahima", "Manager");
		  m.calSalary();*/
		  Labour l = new Labour(103, "Swetha", "Labour");
		  l.calSalary();
	  }
	}

