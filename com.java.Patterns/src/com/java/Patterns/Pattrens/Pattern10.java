package com.java.Patterns.Pattrens;

/*
*
**
***
****
*****
****
***
**
*

 */
public class Pattern10 {
	
	static void pattern10(int n) {
		//1st half
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++){
				System.out.print("* ");
			}
			System.out.println();
			
		}
		
		//2nd half
		for(int i=0;i<n-1;i++) {
			for(int j=1;j<=((n-1)-i);j++){
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
	}
	
	
	public static void main(String[] args) {
		pattern10(3);
		
	}

}
