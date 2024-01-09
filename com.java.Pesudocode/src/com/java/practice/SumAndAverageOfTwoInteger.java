package com.java.practice;

import java.util.Scanner;

public class SumAndAverageOfTwoInteger {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Ineger A : ");
		int num1=input.nextInt();
		System.out.print("Entet the Integer B : ");
		int num2=input.nextInt();
		
		double sum=num1+num2;
		double avg=sum/2;
		
		System.out.println("The Sum of "+num1 +" and " +num2 +" is " + sum);
		System.out.println("The avg of "+num1 +" and " +num2 +" is " + avg);
		
		
		
	}
	
	
}
