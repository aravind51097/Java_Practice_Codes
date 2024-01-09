package com.java.FileHandling;


import java.io.File;
import java.io.IOException;

public class CreateFile {
	public static void main(String[] args) {
		
		try {
			
			File myFile = new File("MyNewFile.txt");
			
			if(myFile.createNewFile()) {
				System.out.println("New File Created  : " +myFile.getName());
			}
			else {
				System.out.println("File Already exist ");
			}
	
		
	}	catch(IOException e){
		System.out.println("Error Occured");
		
		}
	}

}
