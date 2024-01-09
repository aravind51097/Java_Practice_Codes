package com.java.Rectangles;


class Rectangle{
	int length ;
	int width;
	public Rectangle(int length ,int width){
		this.length=length;
		this.width=width;
		
	}
	
	public void set_lenght(int length) {
		this.length=length;
	}
	
	public void set_width(int width ) {
		this.width=width;
	}
	
	public int get_length() {
		return this.length;
	}
	
	public int get_width() {
		return this.width;
	}
	
	public int area() {
		return this.length *this.width;
	}
	
	public int perimeter() {
		return 2*(this.length+this.width);
	}
	
	
}
	


public class Rectangles {
	public static void main(String[] args) {
		
		
		
		Rectangle rect=new Rectangle(3,2);
		
		System.out.println("Area of the rect before : "+rect.area());
		
		rect.set_lenght(5);
		rect.set_width(54);
		System.out.println("length : "+rect.get_length());
		System.out.println("width : "+rect.get_width());
		System.out.println("Area of the rect after  : "+rect.area());
		
		
		
	}

}
