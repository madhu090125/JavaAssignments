package com.classes;

public abstract class ShapeClasses {
	 
	public abstract void draw();

}

class Line extends ShapeClasses{
	public void draw() {
		System.out.println("Drawing Line....");
	}
}

class Rectangle extends ShapeClasses{
	public void draw() {
		System.out.println("Drawing Rectangle....");
	}
}

class Cube extends ShapeClasses{
	public void draw() {
		System.out.println("Drawing Cube....");
	}
}




