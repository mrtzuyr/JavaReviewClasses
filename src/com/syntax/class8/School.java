package com.syntax.class8;

public class School {
	public static void main(String[] args) {
		
		Students s1=new Students();
		s1.name="Aiden";
		s1.lastName="Brook";
		s1.grade=9;
		s1.gradeLevel='A';
		
		Students s2=new Students();
		s2.name="Madison";
		s2.lastName="White";
		s2.grade=11;
		s2.gradeLevel='F';
		
		Students s3=new Students();
		s3.name="Jack";
		s3.lastName="Carter";
		s3.grade=10;
		s3.gradeLevel='B';
		
		System.out.println(s1.name+" "+s1.lastName+" is in grade "+s1.grade);
		s1.study();
		System.out.println("~~~~~~~~~");
		System.out.println(s2.name+" "+s2.lastName+" is in grade "+s2.grade);
		s2.talk();
		System.out.println("~~~~~~~~~");
		System.out.println(s3.name+" "+s3.lastName+" is in grade "+s3.grade);
		s3.sleep();
		
		System.out.println("************************************************");
		
		Teachers t1=new Teachers();
		t1.name="Emily";
		t1.lastName="Young";
		t1.major="Math";
		t1.experience=13;
		t1.salary=58000;
		
		Teachers t2=new Teachers ();
		t2.name="Alex";
		t2.lastName="Wright";
		t2.major="Social Studies";
		t2.experience=7;
		t2.salary=41000;
		
		Teachers t3=new Teachers();
		t3.name="Jessica";
		t3.lastName="Hunter";
		t3.major="English";
		t3.experience=18;
		t3.salary=64000;
		
		System.out.println(t1.name+" "+t1.lastName+" is a "+t1.major+" teacher");
		t1.teach();
		System.out.println("~~~~~~~~~");
		System.out.println(t2.name+" "+t2.lastName+" is a "+t2.major+" teacher");
		t2.yell();
		System.out.println("~~~~~~~~~");
		System.out.println(t3.name+" "+t3.lastName+" is a "+t3.major+" teacher");
		t3.love();
	
		
	}
}
