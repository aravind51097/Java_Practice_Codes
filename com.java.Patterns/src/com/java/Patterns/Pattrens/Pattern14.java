package com.java.Patterns.Pattrens;

/*
A
AB
ABC
ABCD
ABCDE
ABCDEF

 */

public class Pattern14 {
	
	static void pattern14(int n ) {
		for(int i=0;i<=n;i++) {
			for(char ch='A';ch<='A'+i;ch++) {
				
				System.out.print(ch);
			}
			System.out.println();
	}
	}
	public static void main(String[] args) {
		pattern14(5);
		

}

}