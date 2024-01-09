package com.java.CollectionsJava;
import java.util.ArrayList;
import java.util.Iterator;


public class ArrayLists {
	
	
	public static void main(String[] args) {
		
		ValuesAssign obj=new ValuesAssign();
		
		System.out.println(obj.setValues());
		
		obj.getValue();
		
	}
}


class Student {
	
	String name;
	int rollNo;
	int marks;
	
	public Student(String name ,int rollNo,int marks ) {
		
		this.name=name ;
		this.rollNo=rollNo;
		this.marks=marks;
		
		
	}
	
}



class ValuesAssign{
	
	ArrayList<Student> setValues(){
		
		Student s1=new Student("aravind ",1,57);
		Student s2=new Student("Srala ",2,93);
		Student s3=new Student("Dhanvi ",3,99);
		Student s4=new Student("Bujji ",4,98);
		
		
		ArrayList<Student> students=new ArrayList<Student>();
		
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		
		return students;
		
	}
	
	void getValue(){
		
		ValuesAssign get =new ValuesAssign();
		
		Iterator<Student> itr=get.setValues().iterator();
		
		
		while(itr.hasNext()) {
			Student s=(Student) itr.next();
			
			System.out.println(" Name : "+s.name+"  rollNum : "+s.rollNo+" marks :"+s.marks);
		}
		
	} 
	
	
}

