package com.streams;

public class Trader {
	String name,city;

	public Trader(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}
	public String getName() {
		return name;
	}
	public void setName() {
		this.name=name;
	}
	public String getCity() {
		return city;
	}
	public void setCity() {
		this.city=city;
	}
	@Override
	public String toString() {
		return "Trader [name=" + name + ", city=" + city + "]";
	}
	
	

}
