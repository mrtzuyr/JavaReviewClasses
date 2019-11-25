package com.syntax.class9;

public class Democrat {
	String voterName;
	static String candidate;
	static int totalVotes, totalContributions;
	
	void vote(){
		System.out.println(voterName+" voted for "+candidate);
		totalVotes++;
	}
	
	void contribute(int donate) {
		System.out.println(voterName+" donated $"+donate+" for "+candidate);
		totalContributions+=donate;
	}

}
