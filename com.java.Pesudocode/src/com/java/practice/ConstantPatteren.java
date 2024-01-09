package com.java.practice;


class Pattrren{
	void patteren(int num) {
		
		for(int i=1;i<=num;i++) {
			System.out.println("*".repeat(num));
		}
	}
}

public class ConstantPatteren {
	public static void main(String[] args) {
		Pattrren obj=new Pattrren();
		
		obj.patteren(5);
	}
	

}
