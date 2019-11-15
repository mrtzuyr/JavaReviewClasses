package com.syntax.class6;

public class SumOfRows2 { 
	   public static void main(String[] args) {
		   
		   int[][] b = {   { 2, 3, 5 }, 
			               { 2, 4, 7 }, 
			               { 8, 1, 9 }, 
			               { 3, 5, 1 } 
			  						     };
		 
		   int sum = 0;
	        for (int i = 0; i < b.length; i++) {
	        	
	            for (int k = 0; k < b[i].length; k++) {
	            	
	                sum += b[i][k];
	                
	              
	            }
	        
	            System.out.println("sum in row "+i+" is " + sum);
	            sum=0;
	        }
	        
	        
	}

}
