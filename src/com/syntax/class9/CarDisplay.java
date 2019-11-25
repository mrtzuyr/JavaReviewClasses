package com.syntax.class9;

public class CarDisplay {
	public static void main(String[] args) {
		
		SuperCar obj=new SuperCar("Toyota","Camry","blue");
		obj.info();
		
		SuperCar obj1=new SuperCar(140, 32, 2019);
		obj1.info1();
		
		System.out.println("~~~~~~~~~~~~~~~~");
		
		SuperCar obj2=new SuperCar("Honda","Accord","gray");
		obj2.info();
		
		SuperCar obj3=new SuperCar(125, 33, 2020);
		obj3.info1();		
	}

}
