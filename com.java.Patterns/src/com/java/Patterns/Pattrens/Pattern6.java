package com.java.Patterns.Pattrens;


/*
 12345
 1234
 123
 12
 1
 */


public class Pattern6 {
	
	static void pattern6(int n ) {
		
		for(int i=0;i<=n;i++) {
			for(int j=0;j<n-i;j++) {
				System.out.print(j+1 + " ");
			}System.out.println();
		}
	
	}
	public static void main(String[] args) {
		pattern6(5);
		
	}

}
