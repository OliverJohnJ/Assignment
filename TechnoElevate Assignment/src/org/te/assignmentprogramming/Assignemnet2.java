package org.te.assignmentprogramming;

import java.util.Scanner;

public class Assignemnet2 {
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		int a =S.nextInt();
		int f1=0;
	    int f2=1;
	    int count=0;
	    int f3;
		do {
		if(count==0) {
	    System.out.print(f1 +" ");
		System.out.print(f2+ " ");
		count=2;
		}
		f3 =f1+f2;
		f1 = f2;
		f2 = f3;
	    System.out.print(f3+" ");
	    count ++;
	    }while(count<=a);
		
		 
	}

}
