package org.te.Logger;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Demo {
	
	private static Logger l = Logger.getLogger("com.te");
	public static void main(String[] args) {
		ConsoleHandler ch = new ConsoleHandler();
		l.addHandler(ch);
		//l.setLevel(Level.WARNING);
		l.severe("i am severe");
		l.warning("i am warning");
		l.config("i am config");
		
	}

}
