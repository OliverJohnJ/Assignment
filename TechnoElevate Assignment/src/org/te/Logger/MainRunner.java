package org.te.Logger;

import java.util.Scanner;

public class MainRunner {
	
	public static void main(String[] args) {
		Helper h = new Helper();
		System.out.println("what kind of hero you want batman :superman :wonderwomen");
		String name =new Scanner(System.in).next();
		h.Heroes(name);
		
		
		
		
		
	}
	

}
