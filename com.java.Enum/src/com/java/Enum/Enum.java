package com.java.Enum;


enum Status{
	
	Running ,Pending,Failed,Pass;
	
	
}

public class Enum {
	
	public static void main(String[] args) {
		
		Status s=Status.Pass;
		
		switch(s) {
		
		case Running :
			System.out.println("test is Running ");
			break;
		case Pending :
			System.out.println("Test is waitig in Que");
			break;
		case Failed :
			System.out.println("Test Failed ");
			break;
			
		case Pass:
			System.out.println("Test Pass");
			break;
			
		default:
			System.out.println("Process Ran ");
			break;
		
		
		
		}
		
		
	}

}
