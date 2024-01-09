package com.java.FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class AppendingData {
	
	public static void main(String[] args) {
		
		
		try {
			FileWriter myfile =new FileWriter("MyNewFile.txt");
			myfile.append("Hey This Is second line added by aravind in append class");
			myfile.close();
			System.out.println("Append success !");
			
		}catch(IOException e) {
			
			System.out.println("error occure in file writing");
		}
		
	}

}
