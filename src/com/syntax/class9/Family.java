package com.syntax.class9;

public class Family {
	
	static String lastName;
	String firstName;
	char gender;
	int salary;
	static int population;
	
	void info () {
		System.out.println(firstName+" "+lastName+" makes $"+salary+" monthly.");
	}
	
	void increment () {
		population++;
	}

}
