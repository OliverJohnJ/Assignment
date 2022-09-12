package org.te.collection;

import java.util.Iterator;
import java.util.TreeSet;

public class Tree {

	
	public static void main(String[] args) {
		TreeSet<Student> tr = new TreeSet<Student>();
		tr.add(new Student("John", 115, "Male"));
		tr.add(new Student("Robin", 110, "Male"));
		tr.add(new Student("Anil", 15, "Male"));
		tr.add(new Student("Mahadesh", 125, "Male"));
		Iterator<Student> itr = tr.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
}
