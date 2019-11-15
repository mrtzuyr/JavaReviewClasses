package com.repl.it;

public class Replit85 {
	public static void main(String[] args) {

		int[][] a = { { 1, 1, 1 }, 
					  { 1, 1, 1 }, 
					  { 1, 1, 1 } };
		// should be true

		boolean flag = false;
		
		for (int i = 0; i < a.length; i++) {
			if (a.length == a[i].length){
				flag = true;
			}else {
				flag=  false;
				break;
			}
			
			
		}
		System.out.println(flag);

	}
}
