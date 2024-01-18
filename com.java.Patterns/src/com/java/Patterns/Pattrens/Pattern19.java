package com.java.Patterns.Pattrens;


/*
**********
****  ****
***    ***
**      **
*        *
*        *
**      **
***    ***
****  ****
**********
 */

public class Pattern19 {
	static void pattern19(int n) {
		int space = 0;
		for (int i = 1; i <= n; i++) {
			int star = n - i;

			// star
			for (int j = 0; j <= star; j++) {
				System.out.print("*");
			}

			// space
			for (int j = 1; j <= space; j++) {
				System.out.print(" ");
			}

			// star
			for (int j = 0; j <= star; j++) {
				System.out.print("*");
			}
			space += 2;
			System.out.println();
		}

		for (int i = 1; i <= n; i++) {

			int spaces = 2 * n - (2 * i);

			// star
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}

			// space
			for (int j = 1; j <= spaces; j++) {
				System.out.print(" ");
			}

			// star
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();

		}

	}

	public static void main(String[] args) {
		pattern19(5);

	}

}
