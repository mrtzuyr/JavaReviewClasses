package com.syntax.class9;

public class SuperCar {
	/*
	 * Create a SuperCar class.
	 * It should have at least 10 variables, like : make, brand, year, manufacturer, axle, tireNumber,,,
	 * Create at least 4 Constructors with different number of parameters
	 */
	String make, model, color;
	int horsePower, mpg, year;
	
	  public SuperCar() {
	  
	  }
	 
	
	public SuperCar(String make1,String model1,String color1) {
		make=make1;
		model=model1;
		color=color1;
	}
	
	public SuperCar(int horsePower1,int mpg1,int year1 ) {
		horsePower=horsePower1;
		mpg=mpg1;
		year=year1;
		
	}
	
	
	void info() {
		System.out.println("This is "+color+" "+make+" "+model+".");
	}
	
	void info1() {
		System.out.println("Its horsepower is "+horsePower+" and mpg is "+mpg);
	}
	
	
	
	
	
	
	
	
	
	
}
