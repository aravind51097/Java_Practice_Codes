package com.java.Patterns.Pattrens;


/*
 1
 01
 101
 0101
 10101 
 */

public class Pattern11 {
	
	static void pattern11(int n){
		for(int i=1;i<=n;i++) {
			
			if(i%2==0) {
				for(int j=1;j<=i;j++) {
					if(j%2!=0)
						System.out.print(0);
					else
						System.out.print(1);
				}
			}
			else {
				for(int j=1;j<=i;j++) {
					if(j%2==0)
						System.out.print(0);
					else
						System.out.print(1);
				}
			}
			
			System.out.println();
			
		}
	}
	
	public static void main(String[] args) {
		
		
		pattern11(5);

	}

}
