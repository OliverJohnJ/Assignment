package org.te.collection;

public class Student implements Comparable<Student> {
	String name;
	int id;
	String gender;
	public Student(String name, int id, String gender) {
		super();
		this.name = name;
		this.id = id;
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "name=" + name + ", id=" + id + ", age=" + gender ;
	}
	
	
	@Override
	public int hashCode() {
		return this.id;
	}
	
	
	
	
	@Override
	public int compareTo(Student o) {
		
		return this.name.compareTo(o.name);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
