package com.syntax.class8;

public class MathOperations {

	void add(int a, int b, int c) {
		int sum = a + b + c;
		System.out.println("The sum is " + sum);
	}

	void substrack(int a, int b) {
		int result = a - b;
		System.out.println(a + "-" + b + "=" + result);
	}
	void multiply(double a, double b) {
		double result= a*b;
		System.out.println("The multiplication of "+a+" and "+b+" is "+result);
	}
	void divide(double a, double b) {
		double result=a/b;
		System.out.println("The division of "+a+" by "+b+" is "+result);
	}

}
