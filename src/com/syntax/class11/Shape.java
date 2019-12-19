package com.syntax.class11;

public abstract class Shape {
	
	String color;
	
	public Shape(String color) {
		this.color=color;
	}
	
	public abstract double calculateArea();
	public abstract double calculatePerimeter();

}
