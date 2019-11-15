package com.syntax.class8;

public class Return {
	
	int sum(int a, int b) {
		int result=a+b;
		return result;
	}
	
	int substrack(int a, int b) {
		int result=a-b;
		return result;
	}

	int multiply(int a,int b) {
		int result=a*b;
		return result;
	}
	
	double division(double a, double b) {
		double result=a/b;
		int resultInt=(int) result;
		return resultInt;
	}
	String whatever(int a, int b) {
		int result=a*b;
		return "hahahah";
	}

	public static void main(String[] args) {
		Return obj=new Return();
		
		int sum=obj.sum(12, 14);
		System.out.println(sum);
		
		int substrack=obj.substrack(132, 12);
		System.out.println(substrack);
		
		int multiply=obj.multiply(12, 20);
		System.out.println(multiply);
		
		double division=obj.division(36, 5);
		System.out.println(division);
		
		String str=obj.whatever(23, 43);
		System.out.println(str);
		
		
		
		
		
		
		
		
		
}
	}