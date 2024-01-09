package com.java.FunctionalInterface;


interface Price{
	
	
	int priceSetter(int a);
	
}





public class lambda {
	
	public static void main(String[] args) {
		
//		Price obj=new Price(){
//			
//			public int priceSetter(int a){
//				
//				return a;
//			}
//		};
//		
		
		
	//*******Lambda expression**********//	
		
		Price obj= i-> {
			System.out.println(i+3);
			return i;
			} ;
			
	//***********************************//
		
		System.out.println(obj.priceSetter(9));
		
		
		
	}
	

}
