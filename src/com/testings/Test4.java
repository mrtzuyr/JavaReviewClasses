package com.testings;

public class Test4 {
	public static void main(String[] args) {
	       int[][] b = { { 4, 1, 5 }, { 2, 4, 7 }, { 19, 1, 9 }, { 3, 5, 21 } };
	        int min = b[0][0];
	        for (int i = 0; i < b.length; i++) {
	            for (int j = 0; j < b[i].length; j++) {
	                if (b[i][j] < min) {
	                    min = b[i][j];
	                }
	            }
	        }
	        System.out.println("minimum is " + min);
	        int max = b[0][0];
	        int secondMax = b[0][0];
	        for (int i = 0; i < b.length; i++) {
	            for (int j = 0; j < b[i].length; j++) {
	                if (b[i][j] > max) {
	                    max = b[i][j];
	                  
	                } else if (b[i][j] < max) {
	                    secondMax = max;
	                }
	            }
	        }
	        System.out.println("maximum is " + max);
	        System.out.println("\nSecond maximum number is:" + secondMax);
	      
	        
	      
	       
	    }
	

}
