package com.syntax.class8;

public class Teachers {
	
	String name, lastName, major;
	int experience, salary;
	
	void teach() {
		System.out.println(name+" "+lastName+" teaches very well. This teacher has been teaching "+
	experience+" years and makes "+salary+" dollars annually.");
	}
	
	void yell() {
		System.out.println(name+" "+lastName+" yells a lot. This teacher has been teaching "+
				experience+" years and makes "+salary+" dollars annually.");
	}
	
	void love() {
		System.out.println(name+" "+lastName+" is loved by students very much. This teacher has been teaching for "+ 
				experience+" years and makes "+salary+" dollars annually.");
	}

}
