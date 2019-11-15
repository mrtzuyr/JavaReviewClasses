package com.questions1;

import java.util.Scanner;

public class InterviewQuestion6 {
	public static void main(String[] args) {
		
		//Write a Java Program to find whether a String is palindrome or not?
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Type a word to check if it is palindrome");
		String userInput=scan.nextLine();
		
		String a="";
		
		for (int i = userInput.length()-1; i >= 0; i--) {
			a=a+userInput.charAt(i);
		}
		
		if(a.equals(userInput)) {
			System.out.println("The string is palindrome");
		}else {
			System.out.println("The string is not palindrome");
		}
		
		
	}

}
