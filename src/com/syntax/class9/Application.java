package com.syntax.class9;

public class Application {
	public static void main(String[] args) {
		
		int []arr= {3,5,37,12,24,27};
		
		ArrayManupilation obj=new ArrayManupilation();
		
		System.out.println("The largest number is "+obj.largestNumber(arr));
		
		System.out.println("The sum of array is "+ArrayManupilation.sumOfArray(arr));
	}
}
