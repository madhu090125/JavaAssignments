package com.examples;

public class Persons {
	private  String firstname;
	private  String lastname;
	int age;
	public Persons(String firstname, String lastname, int age) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
	}
	public String getFirstName() {
		return firstname;
	}
	public void setFirstName(String firstname) {
		this.firstname= firstname;
	}
	public String getlastName() {
		return lastname;
	}
	public void setlastName(String lastname) {
		this.lastname= lastname;
	}
	public int getAge() {
		return age;
	}
	public void setage(int age) {
		this.age= age;
	}
	@Override
	public String toString() {
		return "Persons [firstname=" + firstname + ", lastname=" + lastname + ", age=" + age + "]";
	}
	
	
	

}
