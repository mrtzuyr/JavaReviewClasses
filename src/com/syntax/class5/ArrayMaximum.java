package com.syntax.class5;

import java.util.Scanner;

public class ArrayMaximum {
	public static void main(String[] args) {
		
	
	Scanner scan=new Scanner(System.in);
	System.out.println("Size?");
	int size=scan.nextInt();
	int[] nums=new int[size];
	
	for(int i=0; i<size;i++) {
		System.out.println("Enter a number");
		nums[i]=scan.nextInt();
		
	}
	int max=0;
	for(int i=0; i<nums.length; i++) {
		if(nums[i]>max) {
			max=nums[i];
			
		}
		
	}
	System.out.println("Max number is "+max);

}
}