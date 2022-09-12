package org.te.collection;

import java.util.HashSet;
import java.util.Iterator;

public class HasSet {	

	public static void main(String[] args) {
	HashSet<Student> hs = new HashSet<Student>();
	Student e1=new Student("david", 002, "male");
	Student e2=new Student("indran", 003, "male");
	Student e3=new Student("naveen", 004, "male");
	Student e4=new Student("robin", 005, "male");
	hs.add(e1);
	hs.add(e2);
	hs.add(e3);
	hs.add(e4);
	Iterator itr =hs.iterator();
	hs.remove(e4);
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*	hs.add("dhoni");
		hs.add(10);
		hs.add(10.00);
		hs.add("DHONI");
		hs.add("DELHI");
		Iterator itr = hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}  */
		
	}
}
