package org.te.assignment;

public class MultiThreading extends Thread{
	
	
	@Override
	public
	void run() {
		for(int i =0;i<10;i++) {
			System.out.println("thread 1");
			System.out.println("=======");
		}
		
	}
	
	
	
	
	public static void main(String[] args) {
		MultiThreading m = new MultiThreading();
		m.start();
		for(int i =0;i<10;i++) {
			System.out.println("thread 2");
			System.out.println("=========");
		}
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	

}
