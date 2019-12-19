package com.syntax.class11;

public class Rectangle extends Shape {
	
	int widht;
	int height;
	
	public Rectangle(int widht, int height, String color) {
		super(color);
		this.widht=widht;
		this.height=height;
	}
	
	@Override
	public double calculateArea() {
		return widht*height;
	}

	@Override
	public double calculatePerimeter() {
		return 2*(widht+height);
	}

}
