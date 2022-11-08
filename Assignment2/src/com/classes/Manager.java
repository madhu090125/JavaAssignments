package com.classes;
public class Manager extends Employee{

	Manager(int id, String name, String desg) {
		super(id, name, desg);
	}
	
	public void calSalary() {
		int incentive = 5000;
		int totSalary = super.bp + super.hra + super.da + incentive;
		System.out.println("Total Salary of a Manager: "+ totSalary);
	}

}
