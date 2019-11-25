package com.testings;


class Main {
  String schoolName;
  int batch;
  String year;
  String lastDayOfClass;
  
  Main(){}
  
  Main(String school, int batch, String year, String last){
    schoolName=school;
    this.batch=batch;
    this.year=year;
    lastDayOfClass=last;
  }
  Main(int batch){
	    
	    this.batch=batch;
	    
	  }
  
	void display(){
	  System.out.println(schoolName+" "+batch+" "+year+" "+lastDayOfClass);
	}
	
	public static void main(String[] args) {
		
			Main obj=new Main(0);
		    Main obj1=new Main("SyntaxTechnologies", 4, "2019","07/30/2019");
		    
		    obj.display();
		    obj1.display();
	}
}