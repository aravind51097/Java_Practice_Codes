package com.java.ArrayLists;

import java.util.ArrayList;

public class ConvertArrayListtoArray {
	
	
	public static void main(String[] args) {
		
		ArrayList<Integer> arrayList=new ArrayList<>();
		
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(4);
		arrayList.add(5);
		
		int len=arrayList.size();
		
		int arr[]=new int[len];
		
		for(int i=0;i<len;i++) {
			
			arr[i]=arrayList.get(i);
			
		}
				
		for(int n:arr) {
			System.out.println(n);
		}
		
	}

}
