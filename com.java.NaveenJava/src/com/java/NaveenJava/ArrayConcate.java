package com.java.NaveenJava;

import java.util.Collection;
import java.util.Collections;

class Concate{
	
	int[] addArray() {
		int arr1[]=new int[3];
		arr1[0]=1;
		arr1[1]=4;
		arr1[2]=3;
		
		
		
		int arr2[]=new int[4];
		arr2[0]=1;
		arr2[1]=4;
		arr2[2]=7;
		arr2[3]=9;
	
		
		int arr3[]=new int[arr1.length+arr2.length];
		for (int i=0;i<=arr1.length-1;i++) {
			arr3[i]=arr1[i];
			if(arr1[i]==arr1[arr1.length-1]) {
				for(int j=0;j<arr2.length;j++) {
					arr3[i+j+1]=arr2[j];
					
					
					
				}
			}
			
			
		}
		
		
		return arr3;
	}
	
}


public class ArrayConcate {
	
	public static void main(String[] args) {
		
		Concate concatedArr=new Concate();
		
		for(int n:concatedArr.addArray()) {
			System.out.println(n);
		}
		
		
	}

}
