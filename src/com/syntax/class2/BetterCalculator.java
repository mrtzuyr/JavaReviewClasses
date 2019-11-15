package com.syntax.class2;

import java.util.Scanner;

public class BetterCalculator {
	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter in first number");
		double num1=scan.nextDouble();
		System.out.println("Enter in operator");
		String operator=scan.next();
		if(!(operator.equals("*")||operator.equals("/")||operator.equals("+")||operator.equals("-"))) {
		System.out.println("Please enter in a valid operator");
		}else {
			System.out.println("Please enter in second number");
		}
		double num2=scan.nextDouble();
		
		
		if(operator.equals("+")) {
			System.out.println(num1+num2);
		}else if(operator.equals("-")) {
			System.out.println(num1-num2);
		}else if(operator.equals("/")) {
			System.out.println(num1/num2);
		}else if(operator.equals("*")) {
			System.out.println(num1*num2);
		}else {
		    System.out.println("Please enter in a valid operator"); 
		}
		
		
	}

}
