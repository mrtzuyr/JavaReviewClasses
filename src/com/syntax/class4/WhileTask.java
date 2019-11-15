package com.syntax.class4;

import java.util.Scanner;

public class WhileTask {

	public static void main(String[] args) {
		 //	Task One	
		/* print only even numbers from 1 to 20 */
		
		int i=1;
		while(i<=20) {
			if(i%2==0) {
				System.out.println(i);
			}
			i++;
		}
		
		//Task Two
		// how to print numbers from 5 to 25 inclusive all in 1 line with space in between?
		 
		int a=5;
		while(a<=25) {
			System.out.print(a+" ");
			a++;
		}
		 
		System.out.println();		 
				 
				 //Task Three 
				 
		//Prompt the user to ask the name 3 times and print "Hello____" //
		
		Scanner scan=new Scanner(System.in);
		int b =1;
		while(b<=3) {
			System.out.println("What is your name?");
			String name=scan.nextLine();
			System.out.println("Hello "+name );
			b++;
		}

	}

}
