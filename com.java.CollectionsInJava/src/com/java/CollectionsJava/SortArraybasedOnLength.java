package com.java.CollectionsJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortArraybasedOnLength {
	
	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<>();
		
		
		list.add("Aravind");
		list.add("Sarla");
		list.add("Dhanvi");
		list.add("Krishna");
		System.out.println(list);
 		
		
		Comparator<String> c=new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				
				if(s1.length()>s2.length())
					return 1;
				else 
					return -1;
				
			}
		};
		
		
		Collections.sort(list,c);
		
		System.out.println(list);
		
	}

}
