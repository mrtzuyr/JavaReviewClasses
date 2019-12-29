package com.testings;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Homework {	
	
	public static List<String> addAsia() {
		List<String> asia=new ArrayList<>();
		asia.add("Japan");
		asia.add("South Korea");
		asia.add("Taiwan");
		asia.add("Vietnam");
		return asia;
	}
	
	public static List<String> addEurope() {
		List<String> europe=new ArrayList<>();
		europe.add("Italy");
		europe.add("Germany");
		europe.add("France");
		europe.add("Norway");
		return europe;
	}
	
	public static List<String> addAfrica() {
		List<String> africa=new ArrayList<>();
		africa.add("Kenya");
		africa.add("Mozambik");
		africa.add("Tanzania");
		africa.add("Nigeria");
		return africa;
	}
	
	public static List<String> addAmerica() {

		List<String> america=new ArrayList<>();
		america.add("Colombia");
		america.add("Brazil");
		america.add("Mexico");
		america.add("Argentina");
		return america;
	}
	
	
	public static void main(String[] args) {
		
		List<List<String>>world=new ArrayList<>();
	
		world.add(addAsia());
		world.add(addEurope());;
		world.add(addAfrica());
		world.add(addAmerica());
		
		for(List<String> continent:world) {
			
		Iterator<String>it= continent.iterator();
		while(it.hasNext()) {
		System.out.println(it.next());
		}
		System.out.println();
	}
		
		
		
		
	}
}

