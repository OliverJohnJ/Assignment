package org.te.assignment;

import java.util.Scanner;

public class Driver {
	   Car c = null;
	void Drive(int x) {
		if(x!=1 || x!=2){
			System.out.println("not an valid input");
			return;
		}
		System.out.println("what engine you want");
		String rs = new Scanner(System.in).next();
		int r1 = new Scanner(System.in).nextInt();
		if(x==1) {
			c = new Maruthi(rs,r1);
		}
		else if(x==2) {
			c=new Bmw(rs, r1);
		}
		c.Details();
		System.out.println("press 1 to start");
	
	}

}
