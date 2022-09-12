package org.te.Logger;

public class Processing {
	
	public static void main(String[] args) {
		User u = new User("mandal", 9768455556l,120000, "mandal@ybl");
		User u2 = new User("amit", 9567927183l,12000, "amit@ybl");
         PhonePe pay = new PhonePe();
         pay.al.add(u);
         pay.al.add(u2);
	     pay.sendMoney(9567927183l, 500);
	  System.out.println("program ends");
	}

}
