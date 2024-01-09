package com.java.practice;

import java.util.Scanner;

public class VowelsOrConstant {
	
	public static void main(String[] args) {
		
		
		Scanner input=new Scanner(System.in); 
		System.out.print("Please enter the Character : ");
		
		String user_input=input.next().toLowerCase().trim();
		
			
			if(user_input.length()==1) {
			
			if(user_input.equalsIgnoreCase("a")|| user_input.equalsIgnoreCase("e")
					||user_input.equalsIgnoreCase("i")||user_input.equalsIgnoreCase("o")
					||user_input.equalsIgnoreCase("u")) {
				System.out.println("Vowes");
				
			}else {
				System.out.println("con");
				
			}
			}else {
				
				System.out.println("invalid input");
			}
			
		
		
	}

}
