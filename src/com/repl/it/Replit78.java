package com.repl.it;

import java.util.Scanner;

public class Replit78 {
	public static void main(String[] args) {
		
		
			  Scanner sc=new Scanner(System.in);
			  int [] user= new int[5];
			 
			  for(int i=0; i<user.length; i++){
			    user[i]=sc.nextInt();
			  }
			  for(int i=user.length-1; i>=0; i--){
			    System.out.println(user[i]);
			  }
			  
			  
			  
	}

}
