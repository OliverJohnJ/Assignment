package org.te.collection;

import java.util.ArrayList;
import java.util.Iterator;



public class ArrayDemo {
	
	public static void main(String[] args) {
		ArrayList<Object> al = new ArrayList<Object>();
		al.add(10);
		al.add("20");
		al.add('c');
		al.add(40.00);
		al.add(true);
		System.out.println("======== iterator");
		  Iterator it =al.iterator();
		  while(it.hasNext()) {
			  System.out.println(it.next());
		  }             
		  System.out.println("=======advanced for loop");
		  for(Object s :al) {
			  System.out.println(s);
		  }
		  System.out.println("=======for loop");
    for(int i =0;i<al.size();i++) {	
    	System.out.println(al.get(i));
    }
    	
	}
}
