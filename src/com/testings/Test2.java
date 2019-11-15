package com.testings;

public class Test2 {
	public static void main(String[] args) {
		 
	    
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                if (i == 1 || i == 4)
                    System.out.print("$");
                else if (j == 1 || j == 4)
                    System.out.print("$");
                else
                    System.out.print(" ");
            }
            System.out.println();
	}

        System.out.println("------------------");
        for(int i=1; i<=4; i++){
            for(int x=1; x<=4; x++){
              if(i==2 && x==2 || i==3 && x==2 || i==2 && x==3 || i==3 && x==3) {
            	  System.out.print(" ");
              }else {
            	  System.out.print("$");
              }
            }
            System.out.println();
          }
        System.out.println("-----------------------");
        
        for (int a=1;a<=4;a++) {
            for(int b=1;b<=4;b++) {
            if (a==1 ||b==1||a==4||b==4) {
                System.out.print("$");    
                }else
                {
                    System.out.print(" ");
                }
            }
        System.out.println();
        }
      
}
}