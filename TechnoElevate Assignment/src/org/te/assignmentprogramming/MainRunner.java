package org.te.assignmentprogramming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;

public class MainRunner {
	public static void main(String[] args) {
		Student s1 = new Student("alex", 10, 25);
		Student s2 = new Student("robin", 8, 20);
		Student s3 = new Student("sachin", 56, 32);
		Student s4 = new Student("mahadesh", 79, 19);
	    HashSet<Student> hs = new HashSet<Student>();
	    hs.add(s1);
	    hs.add(s2);
	    hs.add(s3);
	    hs.add(s4);
	    
	    Comparator<Student> comm = new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				Integer i1 = new Integer(o1.id);
				Integer i2 = new Integer(o2.id);
				return i1.compareTo(i2);
			}	    
	    	
	    };
	    
	    ArrayList<Student>al = new ArrayList<Student>(hs);
	    
	    Collections.sort(al, comm);
	   Iterator<Student> itr = al.iterator();
	   while(itr.hasNext()) {
		   System.out.println(itr.next());
	   }
	    
	    
	    
	    
	
	}

}
