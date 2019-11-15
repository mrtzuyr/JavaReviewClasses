package com.repl.it;

public class Replit86 {
	public static void main(String[] args) {
		
		int[][] nums = {
				{1,1,2}, //sum = 4
				{3,1,2}, //sum = 6
				{3,5,3}, //sum = 11
				{0,1,2}  //sum = 3
			};


		int sums[] = new int[nums.length];
		int rowSum = 0;
			for (int i = 0; i < nums.length; i++) {
				
				for (int j = 0; j < nums[i].length; j++) {
					rowSum += nums[i][j];
				}
				
				sums[i] = rowSum;
				rowSum=0;
			}

		for(int sum : sums) {
				System.out.println(sum);
	  }
			
		
			
			
	}

}
