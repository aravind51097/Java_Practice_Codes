package com.java.practice;

import java.util.Scanner;

class Prime{
	void primeNumberInRange(int num1,int num2) {
			if(num1>num2) {
						
						int temp1=num1;
						num1=num2;
						num2=temp1;
					}
		
		System.out.println("The Prime Numbers between " +num1 +" and "+num2 +" are : ");
		for(int i=num1;i<=num2;i++) {
			int temp=0;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					temp=1;
					break;
					
				}
			}if(temp==0) {
				
				System.out.println(i);
			}
			
			
		}
		
	}
}

public class PrimeNumber {
	
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		Prime p=new Prime();
		System.out.println("Please enter the first digit :");
		
		int digit1=input.nextInt();
		System.out.println("Please enter the second digit :");
		int digit2=input.nextInt();
		
		p.primeNumberInRange(digit1,digit2);
		
	}

}
