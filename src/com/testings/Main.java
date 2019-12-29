package com.testings;

import java.util.*;
class Main {  
  public static void main(String []args){
   
    List<Map<String, Object>>dataList=new ArrayList<>();
    
    Map<String, Object>appleMap=new LinkedHashMap<>();
    
    appleMap.put("Items", "Apple");
    appleMap.put("Price",20.00);
    appleMap.put("Quantity",10);
    
    dataList.add(appleMap);
    
    
    Map<String, Object>orangeMap=new LinkedHashMap<>();
    
    orangeMap.put("Items", "Orange");
    orangeMap.put("Price",21.99);
    orangeMap.put("Quantity",10);
    
    dataList.add(orangeMap);
    
    
    
   for(Map<String, Object> e:dataList){
	   Set <String>keys=e.keySet();
	   for(String k:keys){
       System.out.println(k+":"+e.get(k));
     }
   }
   
  }
  }