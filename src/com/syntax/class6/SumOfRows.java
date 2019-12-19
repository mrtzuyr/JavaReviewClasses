package com.syntax.class6;

public class SumOfRows {
	public static void main(String[] args) {
		
		 int[][] b = {   { 2, 3, 5 }, 
				         { 2, 4, 7 }, 
				         { 8, 1, 9 }, 
				         { 3, 5, 1 } 
				  						};
	      
	        
	        int sum = 0;
	        int row = 1;
	        
	        for (int k = 0; k < b[row].length; k++) {
	            sum += b[row][k];
	        }
	        System.out.println("sum in row " + row + " is " + sum);
	}

}
