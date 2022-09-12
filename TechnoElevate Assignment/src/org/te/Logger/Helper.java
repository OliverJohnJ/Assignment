package org.te.Logger;

import java.util.Scanner;

public class Helper {
	
	
	JusticeLeague jl;
	
	void Heroes(String name) {
	if(name.equalsIgnoreCase("Batman"))	
	    jl = new BatMan();
	
   if(name.equalsIgnoreCase("SuperMan"))
		jl = new SuperMan();
	
   if(name.equalsIgnoreCase("wonderwomen"))	
       jl = new WonderWomen();

   name = name.toUpperCase();
     Function(name);

}

	private void Function(String name) {
		System.out.println("what you want to "+name+" to do :");
		System.out.println("details : fly : hit ");
		Scanner S = new Scanner(System.in);
		String rs =S.next();
		if(rs.equalsIgnoreCase("details")) {
			jl.details();
		}
		if(rs.equalsIgnoreCase("fly")) {
			jl.fly();
		}
		if(rs.equalsIgnoreCase("hit")) {
			jl.hit();
		}
		
		
	}

	


	
	
	
	
	
	
	
	
}