package com.questions1;

import java.util.Arrays;

public class InterviewQuestion2 {
	public static void main(String[] args) {
		/*
		 * Write a java program to find the second largest number in the array? Maximum
		 * and minimum number in the array?
		 */

		int[] numbers = { 2, 4, 6, 8, 8 };

		int min = numbers[0];
		int max = numbers[0];
		int secMax = max = numbers[0];

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
			}
			if (numbers[i] < min) {
				min = numbers[i];
			}

		}
		System.out.println(max);
		System.out.println(min);

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > secMax && numbers[i] < max) {
				secMax = numbers[i];
			}
		}

		System.out.println("2nd largest number in the array is : " + secMax);
		/*
		 * Arrays.sort(numbers); int min = numbers[0]; int max = numbers[numbers.length
		 * - 1];
		 * 
		 * System.out.println(min); System.out.println(max);
		 * 
		 * for (int i = numbers.length - 1; i >= 0; i--) { if (numbers[i] > numbers[i -
		 * 1]) { System.out.println("Second biggest number is " + numbers[i - 1]);
		 * break; }
		 * 
		 * }
		 */
	}
}