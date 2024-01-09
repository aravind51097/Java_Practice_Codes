package com.java.WhileLoop;

import java.util.Scanner;

public class MultiplicationTableOfNumber {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the Number : ");
		
		int number = input.nextInt();
		int i=0;
		
		while(i<=10) {
			
			System.out.println(number + " * " + i + " = " + (number*i));
			i++;
		}
		
	}

}
