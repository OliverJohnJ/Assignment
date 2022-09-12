package org.te.assignmentprogramming;

import java.util.Scanner;

public class Assignment5 {
	
	private static int solve(int[] ar) {
		int big=ar[0];
		for(int i =0;i<ar.length;i++) {
			if(big<ar[i]) {
				big = ar[i];
			}
		}
		int small = ar[0];
		for(int i =0;i<ar.length;i++) {
			if(small>ar[i]) {
				small = ar[i];
			}
		}
		return big-small;
	}
	
	
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		System.out.println("enter the size of an array");
		int a = S.nextInt();
		int ar[]= new int[a];
		for(int i =0;i<ar.length;i++) {
			ar[i]=S.nextInt();
		}
		
		int res =solve(ar);
		System.out.println(res);
	}

	

}
