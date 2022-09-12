package org.te.assignment;

public abstract class Car extends Engine{
	
	public Car(String engineName, int power) {
		super(engineName, power);
	}

	abstract void start();
	abstract void run();
	abstract void stop();
	abstract void Details();
	

}
