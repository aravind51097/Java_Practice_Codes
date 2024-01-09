package com.java.FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFiles {
	public static void main(String[] args) {
	
		try {
			
			File myFile = new File("MyNewFile.txt");
			
			Scanner fileReader=new Scanner(myFile);
			
			while(fileReader.hasNext()) {
				
				String data =fileReader.nextLine();
				System.out.println(data);
			}
			
		}catch(FileNotFoundException e) {
			System.out.println("File not found ");
			
		}
	}

}
