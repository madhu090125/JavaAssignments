package com.classes;
public class Employee {
	  int empId;
	  String empName;
	  String Designation;
	  int bp = 15000;
	  int da = 3000;
	  int hra = 1500;
	  
	  Employee(int id, String name, String desg){
		  this.empId = id;
		  this.empName = name;
		  this.Designation = desg;
	  }
	  
	  
	  public void calSalary() { 
		  int salary = bp+da+hra;
		  System.out.println("Salary of an Employee: "+salary);
	  }
	  
	}
