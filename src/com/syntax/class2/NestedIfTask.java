package com.syntax.class2;

public class NestedIfTask {
	public static void main(String[] args) {
		int num = 9;
		
		if (num < 100) {
	         if (num >= 10) {
	             System.out.println("Its a two digit number");
	         }else {
	        	 System.out.println("Its a one digit number.");
	         }
	     } else if (num < 1000) {
	         if (num >= 100) {
	             System.out.println("Its a three digit number");
	         }
	     } else if (num < 10000) {
	         if(num >= 1000) {
	             System.out.println("Its a four digit number");
	         }
	     } else if (num < 100000) {
	         if(num >= 10000) {
	            System.out.println("Its a five digit number");
	         }
	     } else {
	         System.out.println("number is not between 9 & 99999");
	     }
		
		 int n = 8;
	        
	        if(n > 9 && n < 100) {
	            System.out.println("This is 2 digit number");
	        }
	        else if(n >= 100 && n < 1000) {
	            System.out.println("This is 3 digit number");
	        }
	        else if (n >= 1000 && n < 10000) {
	            System.out.println("This is 4 digit number");
	        }
	        else {
	            System.out.println("I don't know");
	        }
	
	}
}