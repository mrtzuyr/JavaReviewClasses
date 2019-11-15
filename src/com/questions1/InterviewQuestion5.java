package com.questions1;

public class InterviewQuestion5 {
	public static void main(String[] args) {

		// Write a java program to reverse String?
		// Reverse a string word by word?

		String str = "Today is Sunday and it is a sunny day";

		String[] array = str.split(" ");
		String reversed = "";
		for (int i = array.length - 1; i >= 0; i--) {
			reversed += array[i] + " ";
		}
		System.out.println(reversed);
		
		
		//////////////////////////////////
		
		
		char[] str1 = str.toCharArray();
		for (int i = str1.length - 1; i >= 0; i--) {
			System.out.print(str1[i]);
		}
		System.out.println();
		
		//////////////////////////////////
		String a="";
		for (int i = reversed.length() - 1; i >= 0; i--) {
			a+= reversed.charAt(i);
		}
		
		System.out.println(a.trim());
		
		
	}
}
