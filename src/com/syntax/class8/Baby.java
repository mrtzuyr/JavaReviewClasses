package com.syntax.class8;

public class Baby {
	String name, lastName, hairColor;
	int weight;
	char gender;
	
	void talk() {
		System.out.println("bla bla bla");
	}
	
	void cry() {
		System.out.println("Baby cries every minute");
	}
	
	void walk (int times) {
		for (int i = 0; i < times; i++) {
			System.out.println("Baby crawls");
		}
	}
	
	void displayFullInfo() {
		System.out.println("Full name is: "+name+" "+lastName);
		System.out.println("Gender is: ");
		if(gender=='M') {
			System.out.println("Boy");
		}else if(gender=='F') {
			System.out.println("Girl");
		}else {
			System.out.println("Unkown");
		}
		System.out.println("Hair color is: "+hairColor);
		System.out.println("Weight is: "+weight+" pounds");
	}
	
	public static void main(String[] args) {
		Baby baby1=new Baby();
		baby1.name="John";
		baby1.lastName="Smith";
		baby1.hairColor="Brown";
		baby1.weight=6;
		baby1.gender='M';
		
		System.out.println(baby1.name);
		System.out.println(baby1.lastName);
		baby1.cry();
		
		System.out.println("******************************************************************");
		
		Baby baby2=new Baby();
		baby2.name="Ann";
		baby2.lastName="Hamilton";
		baby2.hairColor="Yellow";
		baby2.weight=5;
		baby2.gender='f';
		
		System.out.println("Baby's full name is "+baby2.name+" "
		+baby2.lastName+". Hair color is "+baby2.hairColor);
		baby2.walk(3);
		
		System.out.println("******************************************************************");
		
		baby1.displayFullInfo();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
		baby2.displayFullInfo();
	}

}
