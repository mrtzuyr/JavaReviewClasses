package com.syntax.class11;

public class Square extends Shape{
	
	int side;
	
	Square(int side, String color){
		super(color);
		this.side=side;
	}
	@Override
	public double calculateArea() {
		return side*side;
	}

	@Override
	public double calculatePerimeter() {
		return 4*side;
	}

}
