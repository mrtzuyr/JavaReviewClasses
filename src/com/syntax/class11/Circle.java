package com.syntax.class11;

public class Circle extends Shape {
	
	double radius;
	final double pi=3.14;
	
	public Circle(double radius, String color){
		super(color);
		this.radius=radius;
	}
	
	
	public double calculateArea() {
		return radius*radius*pi;
	}

	public double calculatePerimeter() {
		return 2 * pi * radius;
	}
	
	public double calculateDiameter() {
		return 2 * radius;
	}

}
