package org.te.assignmentException;

public class Employee {
	private String name;
	private int id;
	private Double salary;
	public Employee(String name, int id, Double salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
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
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "name=" + name + ", id=" + id + ", salary=" + salary ;
	}
	
	
	
	
	
	
	

}
