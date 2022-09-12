package org.te.assignmentprogramming;

import java.util.Scanner;

public class Assignemt4 {

	
	private static int[] solve(int[] ar) {
		int res []= new int[ar.length];
		int count =0;
		for(int i =ar.length-1;i>=0;i--) {
			res[count]=ar[i];
			count++;
		}
		
		return res;
	}
	
	
	
	
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		System.out.println("enter the size of an array");
		int a = S.nextInt();
		int ar[]= new int[a];
		for(int i =0;i<ar.length;i++) {
			ar[i]=S.nextInt();
		}
	int res[]=solve(ar);
	for(int i =0;i<res.length;i++) {
		System.out.println(res[i]);
	}
	}

	
}
