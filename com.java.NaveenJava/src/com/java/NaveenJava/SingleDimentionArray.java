package com.java.NaveenJava;


class SingleDimArray{
	
	void arr() {
		int nums[]=new int[4];
		
		nums[0]=3;
		nums[1]=7;
		nums[2]=9;
		nums[3]=3;
		
		for (int num :nums ) {
			System.out.println(num+1);
		}
	}
	
	
	void typeTwoDeclaration() {
	
		int nums[]=new int[10];
		
		for (int i =0;i<nums.length;i++) {
			
			nums[i]=(int)(Math.random()*100);
			
		}
		for(int n:nums) {
			System.out.println(n);
		}
		
	}
	
	void StringArr() {
		
		String names[]=new String[3];
		
		
		names[0]="aravind";
		names[1]="Sarala";
		names[2]="Dhanviksha";
		
//		for(String n :names) {
//			
//			System.out.println(n);
//			
//		}
//		
		
		for (int i=0;i<names.length;i++) {
			 
			System.out.println(names[i].charAt(0));
			
		}
		
	}
	
}




public class SingleDimentionArray {
	
	
	public static void main(String[] args) {
		
		SingleDimArray array=new SingleDimArray();
		
//		array.arr();
//		System.out.println();
//		array.typeTwoDeclaration();
//		System.out.println();
//		array.StringArr();
		
		System.out.println(array.toString());
		
		
	}

}
