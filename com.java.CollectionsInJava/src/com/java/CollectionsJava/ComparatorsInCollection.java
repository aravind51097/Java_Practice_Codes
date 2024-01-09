package com.java.CollectionsJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorsInCollection {
	
	public static void main(String[] args) {
		
		
		ArrayList<Integer> list=new ArrayList<>();
		
		
		for(int j=0;j<10;j++) {
			
			list.add((int) (Math.random()*100));
			
		}
//		
		
		//******************************************Comparator **********************
		Comparator<Integer> c=new Comparator<Integer>() {

			public int compare(Integer i, Integer j) {
				if(i%10<j%10)
				
					return 1;
				else
					return -1;
			}
		};

		Collections.sort(list);
		
		System.out.println(list);
		
			
			
			
			
		}
				
				
				
				
				
			
		
		
	}

