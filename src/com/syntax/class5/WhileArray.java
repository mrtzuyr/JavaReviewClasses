package com.syntax.class5;

import java.util.Scanner;

public class WhileArray {
	public static void main(String[] args) {
		
		 // The size of the array is fixed
		
        Scanner scan = new Scanner(System.in);
        
        String[] strArray = new String[5];
        
        int index = 0;
        String name = "";
        
        do {
            System.out.println("Enter names, to stop enter 'STOP'");
            name = scan.nextLine();
            strArray[index] = name;
            index++;
            
        } while (index < strArray.length && !name.equalsIgnoreCase("STOP"));
        System.out.println("----------");
        
        for (int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]);
        }
        
	}

}
