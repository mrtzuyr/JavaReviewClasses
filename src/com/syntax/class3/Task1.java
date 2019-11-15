package com.syntax.class3;

public class Task1 {
	public static void main(String[] args) {
		// Write a program with one int value for salary and four String values for
		// different cars
		// If you make over 50000 a year, you may buy a brand new car otherwise you
		// should buy a used car.
		// For those you can afford a new car there are different price ranges
		// I want anything under 70k to be Audi A5
		// I want anything under 80k to be Mercedes-Benz
		// I want anything under 90k to be Jaguar
		// I want anything under 100k to be Tesla
		// And if you make less than 60k output to read "Save up money and wait until
		// next year"

		int salary = 55000;
		if (salary >= 50000) {
			System.out.println("I will buy a brand new car");
			if (salary >= 50000 && salary < 60000) {
				System.out.println("I'll save up money and wait until next year");
			} else if (salary >= 60000 && salary < 70000) {
				System.out.println("Audi A5");
			} else if (salary >= 70000 && salary < 80000) {
				System.out.println("Mercedes-Benz");
			} else if (salary >= 80000 && salary < 90000) {
				System.out.println("Jaguar");
			} else if (salary > 90000 && salary < 100000) {
				System.out.println("Tesla");
			}
		} else {
			System.out.println("I will buy a used car");
		}

	}

}
