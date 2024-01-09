package com.java.practice;

import java.util.Scanner;

class Patteren{
	
	void star(int num) {
		
		
		for(int i=1 ; i<=num ;i++) {
			
			System.out.println("*".repeat(i));
		}
		
		
	}
	
}

public class StarPatteren {
	
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("specify the number of Rows for * patteren : ");
		int num=input.nextInt();
		
		Patteren obj=new Patteren();
		
		obj.star(num);
		
		
	}

}
