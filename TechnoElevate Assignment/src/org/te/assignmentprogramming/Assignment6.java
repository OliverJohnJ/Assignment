package org.te.assignmentprogramming;

import java.util.Scanner;

public class Assignment6 {
	

private static boolean solve(int[] ar) {
     int count =0;
     for(int i =0;i<ar.length;i++) {
    	 if(ar[i]==3){
    		 count++;
    	 }
     }
	if(count==3) {
		return true;
	}
	return false;
}
	
	
	
public static void main(String[] args) {
	Scanner S = new Scanner(System.in);
	System.out.println("enter the size of an array");
	int a = S.nextInt();
	int ar[]= new int[a];
	for(int i =0;i<ar.length;i++) {
		ar[i]= S.nextInt();
	}
	boolean res=solve(ar);
    System.out.println(res);
}

}
