package com.streams;

public class Fruits {
	String name , colour;
	Integer price,calories;
	public Fruits(String name, String colour, Integer price, Integer calories) {
		super();
		this.name = name;
		this.colour = colour;
		this.price = price;
		this.calories = calories;
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
		
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String name) {
		this.colour = colour;
		
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
		
	}
	public Integer getCalories() {
		return calories;
	}
	public void setCalories(Integer calories) {
		this.calories = calories;
		
	}
	@Override
	public String toString() {
		return "Fruits [name=" + name + ", colour=" + colour + ", price=" + price + ", calories=" + calories + "]";
	}
	

}
