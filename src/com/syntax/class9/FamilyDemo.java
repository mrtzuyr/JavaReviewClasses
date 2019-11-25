
package com.syntax.class9;

public class FamilyDemo {
	public static void main(String[] args) {

		Family.lastName = "Smith";

		Family member1 = new Family();
		member1.firstName = "John";
		member1.gender = 'M';
		member1.salary = 5000;
		Family.population = Family.population + 1;

		Family member2 = new Family();
		member2.firstName = "Jane";
		member2.gender = 'F';
		member2.salary = 6000;
		Family.population = Family.population + 1;

		Family baby = new Family();
		baby.firstName = "Adam";
		baby.gender = 'M';
		baby.salary = 500;
		Family.population = Family.population + 1;

		member1.info();
		member2.info();
		baby.info();
		System.out.println("There are " + Family.population + " members in the family");

	}
}
