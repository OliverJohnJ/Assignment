package org.te.collection;

import java.util.Comparator;

public class Employee implements Comparable <Employee>,Comparator{
	private String name;
	private Integer id;
	private Integer salary;
	

	
	
	@Override
	public int compareTo(Employee o1) {
		
		return this.name.compareTo(o1.name);
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "name=" + name + ", id=" + id + ", salary=" + salary ;
	}



	@Override
	public int compare(Object o1, Object o2) {
		
		
		
		
		return 0;
	}

	
	
	
	
	
	
}
