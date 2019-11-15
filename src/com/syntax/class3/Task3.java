package com.syntax.class3;

import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		
		 // Write a program to found out the user level of experience 
        // Must use a switch statement with a String variable named 
       // levelString and a int variable named level 
      // Beginner level should be 1
     // Intermediate level should be 2
    // Expert level should be 3
		
		Scanner scan=new Scanner(System.in);
		System.out.println("What's your level of experience?");
		String stringLevel=scan.nextLine();
		int level;
		
		switch(stringLevel) {
		case "Beginner":
			level=1;
			break;
		case "Intermediate":
			level=2;
			break;
		case "Expert":
			level=3;
			break;
			default:
			level=0;
		}
		System.out.println("Your level is "+level);
	}

}
