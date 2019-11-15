package com.questions1;

public class InterviewQuestion1 {
	public static void main(String[] args) {
		/*
		 * Write a program to swap 2 numbers without a temporary variable?
		 * Swap 2 strings without a temporary variable?
		 */
		
		int a=10;
		int b=20;
		
		System.out.println("Before swapping a="+a+" b="+b);
		
		a=a+b; //30
		b=a-b; //30-20=10
		a=a-b; //30-10=20
		
		/*
		 * a=a*b; //200
		 * b=a/b; //200/20=10
		 * a=a/b; //200/10=20
		 */
		
		System.out.println("After swapping a="+a+" b="+b);
		
		System.out.println("*******************************");
		
		String s1="Hello";
		String s2="World";
		
		System.out.println("Before swapping a="+s1+" b="+s2);
		
		s1=s1+s2; // HelloWorld
		s2=s1.substring(0,s1.length()-s2.length()); // HelloWorld.substring(0,5)=Hello
		s1=s1.substring(s2.length(),s1.length());  // HelloWorld.subsring(5,10)=World
		
		System.out.println("After swapping a="+s1+" b="+s2);
				
	}

}
