package org.te.assignment;

public class Maruthi extends Car {

	public Maruthi(String engineName, int power) {
		super(engineName, power);
	}
	

	@Override
	void start() {
		System.out.println("maruthi car is started");
		
	}

	@Override
	void run() {
	System.out.println("maruthi car is running");
		
	}

	@Override
	void stop() {
		System.out.println("maruthi car is stopped");
		
	}


	@Override
	void Details() {
		System.out.println("the car is Maruthi");
		System.out.println("the engine is"+this.EngineName);
		System.out.println("the power of engine is "+this.Power);
		
	}

}
