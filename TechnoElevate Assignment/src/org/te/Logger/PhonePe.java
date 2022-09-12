package org.te.Logger;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class PhonePe {
   List<User> al;
 private final Logger l= Logger.getLogger(".com.te.phonePe");

public PhonePe() {
	al= new ArrayList();
l.setLevel(Level.ALL);
FileHandler fl;
try {
	 fl = new FileHandler();
	 fl.setLevel(Level.ALL);
	 l.addHandler(fl);
} catch (SecurityException | IOException e) {
	e.printStackTrace();
}
	
}


void sendMoney(long phoneNumber,double amount) {
	List<User> collect= al.stream().filter(al -> al.getPhoneNumber() == phoneNumber).collect(Collectors.toList());
	if(!collect.isEmpty()) {
		User recevie=collect.get(0);
		double lastBalance =recevie.getBalance() + amount;
		recevie.setBalance(lastBalance);
		l.fine("ruppes "+amount+" the amount have been debited and creadited to "+recevie.getName());
		
		
	}
	else {
		l.warning("the given number is not using phonepe");
	}
	   
	   
	   
	   
	   
	   
   }
   


}
