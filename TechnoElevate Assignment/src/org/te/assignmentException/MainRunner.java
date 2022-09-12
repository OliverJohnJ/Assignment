package org.te.assignmentException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class MainRunner {
	public static void main(String[] args) {
		Employee e1 = new Employee("John",102,10000.00);
		Employee e2 = new Employee("Oliver",101,250000.000);
		Employee e3 = new Employee("Robin",105,350000.000);
		
		
		LinkedList<Employee> l = new LinkedList<Employee>();
		l.add(e1);
		l.add(e2);
		l.add(e3);
		
	Comparator<Employee> commId = new Comparator<Employee>() {

		@Override
		public int compare(Employee o1, Employee o2) {
			
			return o1.getId()-o2.getId();
		}
	};

	Comparator<Employee> commName = new Comparator<Employee>() {

		@Override
		public int compare(Employee o1, Employee o2) {
			
			return (o1.getName()).compareTo(o2.getName());
		}
	};
	
	
	
	Comparator<Employee> commSal = new Comparator<Employee>() {

		@Override
		public int compare(Employee o1, Employee o2) {
			
			return (int) (o1.getSalary()-o2.getSalary());
		}
	};

	
	
			Scanner S = new Scanner(System.in);
			
			String a = S.next();
			if(a.equalsIgnoreCase("name")) {
				Collections.sort(l, commName);
			}
			else if(a.equalsIgnoreCase("id")) {
				Collections.sort(l, commId);
			}
			else if(a.equalsIgnoreCase("salary") ) {
				Collections.sort(l, commSal);
			}
			
	System.out.println("===============================");		
for(Object obj :l) {
//	System.out.println(obj);
}
System.out.println("=====================================");

ListIterator<Employee> it = l.listIterator();
    
while(it.hasNext()) {
	System.out.println(it.next());
}
System.out.println("===================================");
Iterator itr = l.iterator();
while(itr.hasNext()) {		
	System.out.println(itr.next());
}
System.out.println("===========================");

		
		
	}

}
