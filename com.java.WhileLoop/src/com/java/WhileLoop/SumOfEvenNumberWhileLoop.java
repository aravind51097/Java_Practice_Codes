package com.java.WhileLoop;

import java.util.Scanner;

public class SumOfEvenNumberWhileLoop {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Please specify the Number : ");
		int number=input.nextInt();
		int i=0;
		int sum=0;
		while(i<=number) {
			
			if(i%2==0) {
				sum = sum+i;
			}
			i++;
		}
		System.out.println("  The sum of first" + " "+ number +"" + "even Number are :  "+ sum);
	}

}
