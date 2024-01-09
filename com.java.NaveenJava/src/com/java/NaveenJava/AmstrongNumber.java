package com.java.NaveenJava;

import java.util.Scanner;

public class AmstrongNumber {
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("pls enter num:");
		int num=input.nextInt();
		int original=num;
		int temp=0;
		
		
		while(num>0) {
			
				int reminder=num%10;
				int cube=reminder*reminder*reminder ;
				temp=temp+cube;
				num=num/10;
			
	}
		
		String result=(temp==original)?"Amstrong":"not Amstrong";
		System.out.println(result);
			
}}
