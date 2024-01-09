package com.java.Enum;

enum Laptop{
	
	Dell(100),HP(2000),IBM(),Lenovo(500);
	
	private int price;
	
	
	private Laptop() {
		
	}
	
	private Laptop(int price) {
		this.price = price;
	}
	
	
	void setPrice(int price ) {
		
		this.price=price ;
		
	}
	
	int getPrice() {
		
		return price;
	}
	
	
	

}
	


public class EnumAsClass {
	public static void main(String[] args) {
		
		Laptop obj=Laptop.Dell;
		
		int prices=obj.getPrice();
		System.out.println(prices);
		
		obj.setPrice(20001);
		
		System.out.println(obj.getPrice());
			
		
		
	}

}
