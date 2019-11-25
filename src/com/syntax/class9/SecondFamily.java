package com.syntax.class9;

public class SecondFamily {
	public static void main(String[] args) {
		
	Family.lastName="James";
	
	Family member1=new Family();
	member1.firstName="Lebron";
	member1.gender='M';
	member1.salary=30000000;
	member1.increment();
	
	Family member2=new Family();
	member2.firstName="Savannah";
	member2.gender='F';
	member2.salary=10000;
	member2.increment();
	
	member1.info();
	member2.info();
	
	System.out.println("There are " + Family.population + " members in the family");
		
		
		
		
		
	}
}
