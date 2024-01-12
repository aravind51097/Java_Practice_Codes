package com.java.Patterns.Pattrens;


/*
 1      1
 12    21
 123  321
 12344321
 
 */

public class Patteren12 {
	
	static void pattern12(int n) {
		for(int i=1;i<=n;i++) {
			int space=(2*n-2*i);
			
			//num 1st
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			
			//Space
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			
			//num 2nd half reverse
			for(int j=i;j>=1;j--) {
				System.out.print(j);
			}
			
			System.out.println();
			
		}
	}
	
	public static void main(String[] args) {
		pattern12(6);
	}

}
