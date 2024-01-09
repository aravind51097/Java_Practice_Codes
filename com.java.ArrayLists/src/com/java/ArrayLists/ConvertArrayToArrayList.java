package com.java.ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ConvertArrayToArrayList {
	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,6};
		
		List<Integer>  arrayList=new ArrayList<Integer>();
		for(int n:arr) {
			
			arrayList.add(n);
		}
		
		System.out.println(arrayList);
		
		
		
		
	}

}
