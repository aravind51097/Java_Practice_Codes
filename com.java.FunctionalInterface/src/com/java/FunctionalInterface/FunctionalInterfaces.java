package com.java.FunctionalInterface;



@FunctionalInterface  // functi -interface is a interface that has only one method -it help to implement the Lambda exp
interface Shows{
	
	void show();
}


class Display implements Shows{
	
	public void show() {
		
		System.out.println("Im from display method ");
		
	}
}

public class FunctionalInterfaces {

	public static void main(String[] args) {
		
		Shows obj=new Display();
		
		obj.show();
		
	}
	
	
}
