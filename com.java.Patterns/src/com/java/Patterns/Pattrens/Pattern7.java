package com.java.Patterns.Pattrens;

/*
	 *	
	***
   *****
  *******
 */



public class Pattern7 {
	
	static void pattern7(int n) {
		for(int i=1;i<=n;i++) {
			
			int star=(2*i-1);
			int space=n-i;
			
			//space
			for(int j=0;j<space;j++) {
				System.out.print( " ");
			}
			
			//star
			for(int j=0;j<star;j++) {
				System.out.print("*");
			}
			
			//space 
			for(int j=0;j<space;j++) {
				System.out.print( " ");
			}
			
			System.out.println();
		}
		
		
	}
	
	public static void main(String[] args) {
		
		pattern7(5);
		
	}

}
