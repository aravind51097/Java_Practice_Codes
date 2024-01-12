package com.java.Patterns.Pattrens;

/*
******
*****
****
***
**
*
 */

public class Pattern5 {
	
	static void pattern5(int n) {
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		pattern5(5);
		
	}

}
