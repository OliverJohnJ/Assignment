package org.te.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java
.util.Scanner;
public class EmpArrayDemo  {
	public static void main(String[] args) {
		
		Comparator<Employee> comm = new Comparator<Employee>(){

			@Override
			public int compare(Employee o1, Employee o2) {
				
				return (o1.getName()).compareTo(o2.getName());
			}
					};
					
					
		Comparator<Employee> comm2 = new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getSalary()-o2.getSalary();				
					}

								};

					

		Comparator<Employee> comm3 = new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
										
				return o1.getId()-o2.getId();
									}

		};

					
		ArrayList<Employee>al = new ArrayList<Employee>();
		Employee e = new Employee();
		e.setId(11);
		e.setName("John");
		e.setSalary(10000);
		Employee e1 = new Employee();
		e1.setId(10);
		e1.setName("Oliver");
		e1.setSalary(200000);
		Employee e2 = new Employee();
		e2.setId(9);
		e2.setName("Robin");
		e2.setSalary(250000);
		Employee e3 = new Employee();
		e3.setId(117);
		e3.setName("george");
		e3.setSalary(350000);
		al.add(e);
		al.add(e1);
		al.add(e2);
		al.add(e3);
		//al.stream().sorted().forEach(System.out::println);
		System.out.println("===============================");
		//al.stream().sorted(comm3).forEach(System.out::println);
		Scanner S = new Scanner(System.in);
		String s = S.next();
		if(s.equalsIgnoreCase("name")) {
			Collections.sort(al, comm);
		}
		if(s.equalsIgnoreCase("id")) {
			Collections.sort(al, comm3);
		}
        if(s.equalsIgnoreCase("sal")) {
        	Collections.sort(al, comm2);
		}
        
        
        for(Object obj :al) {
        	System.out.println(obj);
        }
			S.close();
		
	}
	
	
	

	

}
