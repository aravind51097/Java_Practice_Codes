package com.java.CollectionsJava;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class MapsInJava {
	
	public static void main(String[] args) {
		
		Map<String,String> grossory =new HashMap<String ,String>();
		
		grossory.put("Name ", "Aravind");
		grossory.put("rollNo", "1");
		grossory.put("Marks", "51");
		
		
		for(Map.Entry<String,String> m : grossory.entrySet()) {
			
			System.out.println(m.getKey() + " " + m.getValue());
		}
		
//		Set s=grossory.entrySet();
//		
//		Iterator itr=s.iterator();
//		
//	   while(itr.hasNext()) {
//		   
//		   Map.Entry<String, String> kv= (Map.Entry<String, String>)itr.next();
//		   
//		   System.out.println(kv.getKey()+"  " + kv.getValue() );
//	   }
		
		
		
	}

}
