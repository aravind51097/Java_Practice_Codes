package com.java.ConstructorwithEncapsulation;



class Dog{
	String d_name ;
	String d_breed;  // creating instance variable 
	
	
	Dog(String name,String breed){  // instance Variable initialization 	
		
		d_name=name;
		d_breed=breed;
		
	}
	
	public void detials() {
	
		System.out.println("Name : "+d_name + " breed : "+d_breed );  //Printing the details before changing the values 
	}

	//Creating the setter and getter methods to set and get the values 
	
	public String getD_name() {
		return d_name;  //returns instance variable
	}


	public void setD_name(String name) {
		this.d_name=name;
		//this.name --> instance variable reference ,d_name-->attribute form methods
	}

	public String getD_breed() {
		
		return d_breed;
	}

	public void setD_breed(String d_breed) {
		this.d_breed = d_breed;
	}
	

}

public class ConstructorwithEncapsulationClass {
	public static void main(String[] args) {
		
		
		Dog dog=new Dog("Bruce","german");
		
		System.out.println("Details before setting the values");
		dog.detials();
		
		
		dog.setD_name("Johny");
		dog.setD_breed("Indian");
		
		System.out.println("Details after setting the value ");
		
		System.out.println("Name :"+dog.getD_name());
		System.out.println("Breed : "+ dog.getD_breed());
		
		
		
		
		
	}

}
