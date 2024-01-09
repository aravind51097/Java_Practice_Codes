package com.java.ArrayLists;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class DupArray {
	public static void main(String[] args) {
		
		
		ArrayList<Integer> lst=new ArrayList<>();
		
		
		lst.add(1);
		lst.add(1);
		lst.add(2);
		lst.add(2);
		lst.add(3);
		
//		
//		Set<Integer> noDup=new HashSet<>(lst);
//		
//		for(int n :noDup) {
//			
//			
//			System.out.println(n);
//		}
//		
		
		Set<Integer> noDup=new HashSet<>();
		noDup.addAll(lst);
		for(int n :noDup) {
			System.out.println(n);
		}
		
		
	}

}
