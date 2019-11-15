package com.syntax.class6;

public class HomeWork {
	public static void main(String[] args) {
	
		//	Create a 2-D array
		//	enter the sum of each row into one element of the array
		//	
		//	enter the sum of each column into one element of the array
		
		
		int [][] nums= {	{ 1,  2,  4,  6, 8 },
							{ 3, 12,  5,  7    },
							{12, 23,           },
							{11, 21, 30        }		
													};
		
		int [] sumRows= new int [nums.length];
		
		int[] colSum =new int[nums[0].length];
		
		for (int i = 0; i < nums.length; i++) {
			int sum=0;
			for (int j = 0; j < nums[i].length; j++) {
				sum+=nums[i][j];
				colSum[j] += nums[i][j];
			}
			
			sumRows[i]=sum;
			System.out.println(sumRows[i]);
			
		}
		for(int k=0;k<colSum.length;k++){
		    System.out.println("Print the sum of columns "+k+" ="+ colSum[k]);
		} 
		
		
	
		
		
		
		
		
		
		}
	}


