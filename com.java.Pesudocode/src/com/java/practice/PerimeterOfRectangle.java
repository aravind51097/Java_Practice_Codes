package com.java.practice;

import java.util.Scanner;

public class PerimeterOfRectangle {
	
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		/* This will calculate parameter of rectangle */
		
		System.out.println("Please enter the Lenght og rectangle: ");
		
		int length=input.nextInt();
		System.out.println("Enter the width of the rectangle : ");
		int width=input.nextInt();
		
		int p=2*(length+width);
		
		System.out.println("Perimeter of the reactangle for lenght "+length +" and width "+width +" is " + p);
		
		
		
		
		
	}

}
