package org.te.assignmentprogramming;

public class Student {
	String name;
	int id;
	int age;
	public Student(String name, int id, int age) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
	}
	@Override
	public String toString() {
		return "name=" + name + ", id=" + id + ", age=" + age ;
	}
	
	
	
	
	
	

}
