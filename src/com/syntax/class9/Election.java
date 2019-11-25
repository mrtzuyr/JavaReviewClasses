package com.syntax.class9;

public class Election {
/*  Create three classes: Elections, Republican, Democratic
	Republican has some variables: voterName, candidate, totalVotes, totalContributions
	Democratic has some variables: voterName, candidate, totalVotes, totalContributions
	Both classes have a method called vote and a method called contribute which takes the amount as parameter.
	In the Elections class you create voters from each party, 
	you set the voter name, and then you make him vote. 
	In the vote method, you print: voterName voted for candidate and also you increase the totalVotes. 
	Some of the voters may want to contribute for their party. 
	They call the method contribute and specify the amount of money they want to contribute. 
	It will be added to the amount of totalContributions.
	At the end you should print the number of votes for each party and check who has more votes is the winner.
	
*/
	public static void main(String[] args) {
		
		Democrat.candidate="Bernie Sanders";
		Republican.candidate="Donald Trump";
		
		Democrat voter1=new Democrat();
		Democrat voter2=new Democrat();
		Democrat voter3=new Democrat();
		
		Republican voter4=new Republican();
		Republican voter5=new Republican();
		Republican voter6=new Republican();
		
		voter1.voterName="Ali";
		voter2.voterName="Veli";
		voter3.voterName="Deli";
		voter4.voterName="Ayse";
		voter5.voterName="Fatma";
		voter6.voterName="Hayriye";
		
		voter1.vote();
		voter4.vote();
		voter2.vote();
		voter5.vote();
		voter3.vote();
		voter6.vote();
		
		System.out.println();
		System.out.println("~~~~~~~~~~~");
		System.out.println();
		
		voter1.contribute(480);
		voter4.contribute(50);
		voter2.contribute(35);
		voter5.contribute(375);
		voter3.contribute(750);
		voter6.contribute(1200);
		
		
		System.out.println();
		System.out.println("~~~~~~~~~~~");
		System.out.println();
		
		System.out.println("Total contribution for "+Democrat.candidate+" is $"+Democrat.totalContributions);
		System.out.println("Total contribution for "+Republican.candidate+" is $"+Republican.totalContributions);
		
		System.out.println(Democrat.totalVotes+" voters voted for "+Democrat.candidate);
		System.out.println(Republican.totalVotes+" voters voted for "+Republican.candidate);
		
		
	}
}








