package org.te.Logger;

import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Log {
	
	
	
	
	
	static public final Logger l = Logger.getLogger("te"+Log.class.getName());
	
	
	
	public static void main(String[] args) throws SecurityException, IOException {
		ConsoleHandler hs = new ConsoleHandler();
		l.addHandler(hs);
		hs.setLevel(Level.FINEST);
		l.severe("i am sever");
		l.warning("this is warning");
		l.info("i am info");
		l.config("i am config");
		l.fine("i am fine");
		l.finest("i am finest");
		
		
		
		
		
		
		///////////////////////////////////////////////////////////////////////////////////////
		
		
		
		/*
		 * FileHandler fh = new FileHandler("G:\\logFile.log");
		 * fh.setLevel(Level.FINEST); l.addHandler(fh);
		 * l.severe("i am file handler severe"); l.config("i am file handler config");
		 * l.warning("i am file handler warning");
		 * 
		 */
		
	//////////////////////////////////////////////////////////////////////////////////////////////////
		
		
		FileHandler fh2  =  new FileHandler("G:\\logFile.log");
		MyFormater my = new MyFormater();
		fh2.setFormatter(my);
		fh2.setLevel(Level.FINEST);
		l.addHandler(fh2);
		l.severe("i am file handler severe");
		l.config("i am file handler config");
		l.warning("i am file handler warning");
		
		
		
		
	}

}
