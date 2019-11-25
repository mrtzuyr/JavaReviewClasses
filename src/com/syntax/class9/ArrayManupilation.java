package com.syntax.class9;

public class ArrayManupilation {
	
	protected int largestNumber(int [] array) {
		int max=array[0];
		for(int element : array) {
			if(element>max) {
				max=element;
			}
		}
		return max;
	}
	
	public static int sumOfArray(int [] array) {
		int sum=0;
		for (int i = 0; i < array.length; i++) {
			sum+=array[i];
		}
		return sum;
	}
}
