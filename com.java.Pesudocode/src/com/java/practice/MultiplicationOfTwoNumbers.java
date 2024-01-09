package com.java.practice;

import java.util.Scanner;

public class MultiplicationOfTwoNumbers {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter the Firts float Num1 : ");
		double num1=input.nextDouble();
		System.out.print("Enter the Firts float Num2 : ");
		double num2=input.nextDouble();
		
		double mul=num1*num2;
		
		System.out.println("The multiplication of "+num1 +" and " +num2 +" is " + mul);
		
		
	}

}
