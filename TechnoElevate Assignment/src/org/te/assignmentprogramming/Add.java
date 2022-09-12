package org.te.assignmentprogramming;

import java.util.Scanner;

public class Add {
	
	
	
	private static void addition(int a1, int i) {
		Scanner S = new Scanner(System.in);
		if(i==0) {
		System.out.println("enter the number you want to add ");
	      a1 =S.nextInt();	
		}
		i = a1 +i;
		System.out.println("do you want to add press yes or no ");
		String rs = S.next();
		if(rs.equals("yes")) {
			int a = S.nextInt();
			addition(a,i);
		}
		else
			System.out.println("the total number is "+ i);
	}




	public static void main(String[] args) {
		addition(0 , 0);
	}

	


	

	

}
