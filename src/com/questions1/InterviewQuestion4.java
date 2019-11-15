package com.questions1;

public class InterviewQuestion4 {
	public static void main(String[] args) {
		/*
		 * How to find out the part of the string from a string? What is substring? 
		 * Find number of words in string?
		 */
		String str="Today is Java Class. There is no class tomorrow";
		
		String[] array= str.split(" ");
		
		System.out.println(array.length);
		
		for (String string : array) {
			System.out.println(string);
		}
	}

}
