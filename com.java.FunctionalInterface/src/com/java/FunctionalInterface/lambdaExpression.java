package com.java.FunctionalInterface;


interface Sum{
	
	int add(int a ,int b); 
	
}

public class lambdaExpression {
	
	public static void main(String[] args) {
		
		
//		Sum obj =new Sum() {
//			
//			
//			public int add(int a ,int b){    //Anonymous implementation 
//				
//				System.out.println(a+b);
//				return a+b
//			}
//		};
//		
		
	//******Lambda implementation ********//
		//simplifying above code 
		
		Sum obj=(i,j)-> i+j;
		
	//************************************//
		
		
		int result=obj.add(4,6);
		
		System.out.println(result);
		
	}

}
