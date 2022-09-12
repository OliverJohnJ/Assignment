package org.te.assignmentprogramming;

import java.util.Scanner;

public class Assignment3 {
	private static int [] Solve(int[] ar) {
	  int res[]= new int[2];
	  if(ar.length>2) {
		  for(int i =0;i<res.length;i++) {
			  res[i]=ar[i];
		  }
	  }
	  else {
		  res[0]=ar[0];
		  res[1]=ar[0];
	  }
	return res;	
	}
	
	
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		System.out.println("enter the size of the array");
		int a =S.nextInt();
		int ar[]= new int[a];
		for(int i =0;i<ar.length;i++) {
			ar[i]=S.nextInt();
		}
		int res[]=Solve(ar);
		for(int i =0;i<res.length;i++) {
			System.out.println(res[i]);
		}
		
		
		
	}

	
}
