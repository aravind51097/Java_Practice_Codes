package com.java.FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFiles {
	
	public static void main(String[] args) {
		
		try {
			FileWriter myFile=new FileWriter("MyNewFile.txt");
			myFile.write("Hi this is Aravind Writing my 1st file in JAVA \n");
			myFile.write("Hi this is Aravind Writing my 1st file in JS");
			myFile.close();
			System.out.println("Write success ! ");
			
		}catch(IOException e) {
			System.out.println("Error occured ");
		}
		
	}

}
