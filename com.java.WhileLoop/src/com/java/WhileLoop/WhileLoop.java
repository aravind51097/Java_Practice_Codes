package com.java.WhileLoop;

public class WhileLoop {
	public static void main(String[] args) {
		
		int i =5;
		while(i>=1) 
		{
			int j=i-1;
			
			while(j>=1) 
			{
				System.out.print("*");
				j--;
			}
			
			System.out.println("*");
			i--;
		}
		}
}
