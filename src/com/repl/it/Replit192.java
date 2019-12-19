package com.repl.it;

import java.util.*;
public class Replit192 {
    
	List<String> method(){
    List<String>list=new LinkedList<>();
    list.add("John");
    list.add("Brian");
    list.add("Ryan");
    return list;
  }
  
  public static void main(String[] args){
   
   List<String>myList=new LinkedList<>();
    
   Replit192 obj=new Replit192();
    
    myList.addAll(obj.method());
    
    for(String e:myList) {
    	System.out.println(e);
    }
  }
}

