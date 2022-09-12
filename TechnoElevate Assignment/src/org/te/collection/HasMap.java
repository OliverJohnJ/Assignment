package org.te.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HasMap {
          
	
	public static void main(String[] args) {
	HashMap<Integer,String> hm = new HashMap<Integer,String>();
	hm.put(1,null);
	hm.put(2,null);
	hm.put(3, "value");
	hm.put(4, "value");
	
	System.out.println("=======================");
	Set<Integer> ks = hm.keySet();
    	Iterator<Integer> itr = ks.iterator();
         while(itr.hasNext()){  
        	 Object it=itr.next();
        	 System.out.println(it+" "+hm.get(it));
         }
         
         System.out.println("==========================================");
         
         Set<Entry<Integer, String>> E = hm.entrySet();
         Iterator<Entry<Integer, String>> itr2 = E.iterator();
      while(itr2.hasNext()) {	
    	  System.out.println(itr2.next());
      }
      System.out.println("===============================================");
	
	
	
	
	
	
	
	
	
	
}
}
