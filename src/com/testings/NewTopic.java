package com.testings;

public class NewTopic {
	public static void main(String[] args) {
		
		//toCharArray
		
		String a="Hello";
		char [] b=a.toCharArray();
		
		for(char c:b) {
			System.out.println(c);
		}
		
		//replace
		
		String str="Good morning class";
		System.out.println(str.replace("o","i"));
		System.out.println(str.replace("Good","Bad"));
		
		//substring
		
		String s="abcdefghjklmnoprstuvyz";
		System.out.println(s.substring(0,10));
		System.out.println(s.substring(4));
	       String word ="abrakadabra";

	       String replace=word.replaceAll("[^aAeEiIoOuU]", " ");

	       System.out.println(replace);
	}

}
