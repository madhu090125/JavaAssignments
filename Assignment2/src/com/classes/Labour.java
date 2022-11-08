package com.classes;
public class Labour extends Employee {

	Labour(int id, String name, String desg) {
		super(id, name, desg);
	}
  
	public void calSalary() {
		int overtime = 3000;
		int totSalary = super.bp + super.hra + super.da + overtime;
		System.out.println("Total Salary of a Labour: "+ totSalary);
	}
}


