package com.java.practice;

class Flags{
	
	void americanFlag() {
		
		for(int row=1;row<16;row++) {
			for(int col=1;col<=50;col++) {
				if(row<11) {
					if(col<=6) {
						if(row%2!=0) {
							System.out.print("* "); 	// printing odd rows of * for 6 time 
					}else if(col<=5) {
								System.out.print(" *");	// printing even rows of * for 5 time 
								if(col==5) {
									System.out.print("  "); //giving a extra space for 5th column for every even row till 10th
							}
						}
					}else if (row%2==0){
							if(col<=44) {
								System.out.print("=");}	// printing odd rows of = 
					}else if(row%2!=0){
						if(col<=44) {
								System.out.print("=");} // printing even rows of = 
							}
				}else {
						System.out.print("=");	//printing = after 10th row for 50 times
					}
			}System.out.println(); //moving cursor for next line after end of 2nd for loop
		}
	}
}


public class PrintingAmericanFalg {
	public static void main(String[] args) {
		
		Flags obj=new Flags();
		obj.americanFlag();
		
	}

}
