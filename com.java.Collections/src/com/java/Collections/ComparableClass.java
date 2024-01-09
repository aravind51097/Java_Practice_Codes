package com.java.Collections;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student> {
	
	String name;
	
	int age ;

	public Student(String name, int age) {
		
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Student that) {
		
		if(this.age<that.age)
			return 1;
		
		else
			return -1;
	}
	
	
	
	
	
}

public class ComparableClass {
	
	public static void main(String[] args) {
		
		
		ArrayList<Student> list =new ArrayList<Student>();
		
		
		list.add(new Student("aravind",26));
		list.add(new Student("Sarala",25));
		list.add(new Student("Dhanvi",1));
		list.add(new Student("Krishna",30));
		
		
		Collections.sort(list);
		
		System.out.println(list);
		
	}

}
