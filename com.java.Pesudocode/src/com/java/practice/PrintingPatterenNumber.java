package com.java.practice;


class NumberPatteren{
	
	void pattren(int num ) {
		
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++) {
			System.out.print(j);
				
			}System.out.println();
			
		}
		
	}
}


public class PrintingPatterenNumber {
	public static void main(String[] args) {
		
		NumberPatteren obj=new NumberPatteren();
		
		obj.pattren(5);
		
	}
}
