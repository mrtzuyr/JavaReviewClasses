package com.questions1;

import java.util.Scanner;

public class InterviewQuestion7 {
	public static void main(String[] args) {
		//Write a java program to check whether a given number is prime or not?
		// 2, 3 (2,3), 4(2,3,4), 5(2,3,4,5), 6(2,3,4,5,6)

				int num = 5;
				boolean isPrime = true;

				if (num <=1) {
					isPrime = false;
				} else {
					for (int i = 2; i < num; i++) {

						if (num % i == 0) {
							isPrime = false;
							break;
						}
					}
				}
				
				if (isPrime) {
					System.out.println(num + " is a Prime number");
				} else {
					System.out.println(num + " is NOT a Prime number");
				}
		
		
	}
}
