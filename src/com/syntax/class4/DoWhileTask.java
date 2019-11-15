package com.syntax.class4;

import java.util.Scanner;

public class DoWhileTask {

	public static void main(String[] args) {
		 //   Task One
        //Write a program using a do while loop to print out all odd number from 0 15 
		
		int i=1;
		do {
			System.out.println(i);
			i+=2;
		}while(i<=15);
		
		//orrrrrr
		
		int a=0;
		do {
			if(a%2!=0) {
			System.out.println(a);
			}
			a++;
		}while(a<=15);
		
		
		
	    //   Task Two
	  //  *keep asking user to pay for candy until entered price is not equal to 3
	   //  *after user got a write amount print "Please enjoy your candy"*/  
        
		Scanner scan=new Scanner(System.in);
		int price;
		do {
			System.out.println("Pay for candy");
		    price=scan.nextInt();
			
		}while(price!=3);
		System.out.println("Enjoy your candy");
	

	}

}
