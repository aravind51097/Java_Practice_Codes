package com.java.CollectionsJava;

import java.util.ArrayList;
import java.util.Collections;

class Students implements Comparable<Students> {
	
	String name;
	int age ;
	@Override
	public String toString() {
		return "Students [name=" + name + ", age=" + age + "]";
	}


	public Students(String name, int age) {
		
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Students that) {
		
		if(this.age>that.age)
			return 1;
		
		else
			return -1;
	}
	
	
	
	
	
}

public class ComparableClass {
	
	public static void main(String[] args) {
		
		
		ArrayList<Students> list =new ArrayList<>();
		
		
		list.add(new Students("aravind",26));
		list.add(new Students("Sarala",25));
		list.add(new Students("Dhanvi",1));
		list.add(new Students("Krishna",35));
		
		
		Collections.sort(list);
		
		System.out.print(list);
		
	}

}
