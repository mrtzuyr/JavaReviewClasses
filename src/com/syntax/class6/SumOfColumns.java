package com.syntax.class6;

public class SumOfColumns {
	public static void main(String[] args) {
		
		int [][] nums= {   {2, 4, 5, 6   },
				           {7, 8, 9      },
				           {12,11,1      },
				           {10,12,1, 2, 3}
												};
		
	
	
		int[] colSum =new int[nums[3].length];
		
		for (int i = 0; i < nums.length; i++) {
		
			for (int j = 0; j < nums[i].length; j++) {
			
				colSum[j] += nums[i][j];
			}
			
		}
		for(int k=0;k<colSum.length;k++){
		    System.out.println("Print the sum of columns "+k+" ="+ colSum[k]);
		}
}}