package com.repl.it;

import java.util.Scanner;

public class Replit77 {
	public static void main(String[] args) {
	    Scanner userInput = new Scanner(System.in);

			String[] arr = new String[7];

			for (int i = 0; i <arr.length; i++) {

				System.out.println("Please enter day " + (i+1) + " of the week");
				arr[i] = userInput.next();
			}
			
		/*
		 * for(int i=0; i<arr.length; i++){ 
		 * System.out.println(arr[i]); 
		 * }
		 */
			
			for(String days:arr) {
				System.out.println(days);
			}
			userInput.close();
	}

}
