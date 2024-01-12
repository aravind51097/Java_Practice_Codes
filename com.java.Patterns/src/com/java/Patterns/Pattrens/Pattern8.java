package com.java.Patterns.Pattrens;

/*
 
  ********
   ******
    ***
     *
 */

public class Pattern8 {
	
	static void pattern8(int n ) {
		for(int i=1;i<=n;i++) {
			
			int space=i-1;
			int star=2*n-(2*i-1);
			
			//space 
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			
			//star
			for(int j=0;j<star;j++) {
				System.out.print("*");
			}
			//space 
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			
			
			System.out.println();
			
			
			
		}
	}
	public static void main(String[] args) {
		pattern8(5);
		
	}

}
