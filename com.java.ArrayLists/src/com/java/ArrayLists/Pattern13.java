package com.java.ArrayLists;

/*
 1
 2 3
 4 5 6
 7 8 9 10
 11 12 13 14
 */
public class Pattern13 {

	static void pattern13(int n) {
		int previous = 0;
		for (int i = 1; i <= n; i++) {
			if(i==2) {
				int start = i + i;
				}
			int start = i + i;
			
			for (int j = 1; j <= i; j++) {
				System.out.print(start);
				start++;

			}
			System.out.println( " previous " +previous);

			previous = i;
		}
	}

	public static void main(String[] args) {

		pattern13(5);

	}

}
