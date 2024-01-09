package com.java.person;

class Person {
	String p_name;
	int p_age;
	Person(String name,int age){
		p_name=name;
		p_age=age;			
	}
	public void detailsOfPerson() {
		System.out.println("age : "+p_age +"   name : "+p_name);
	}	
}
public class PersonClassWithConstructor {
	public static void main(String[] args) {
		String name="Aravind";
		int age =26;
		Person details=new Person(name ,age);
		details.detailsOfPerson();
	
}
}
