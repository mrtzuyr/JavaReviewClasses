package com.testings;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
class Main {
  public static void main(String[]args){
    
  Map<String, String>map=new HashMap<>();
  
  map.put("Street", "Patrick St");
  map.put("Suite","265");
  map.put("City","Vienna");
  map.put("Zip","22180");
  map.put("Country","United States");
  
  Iterator<String> it=map.keySet().iterator();
  while(it.hasNext()){
    String str=it.next();
    System.out.println(str);
  }
  
  
  }
}