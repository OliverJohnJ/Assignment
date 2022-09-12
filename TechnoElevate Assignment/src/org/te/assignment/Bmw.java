package org.te.assignment;

public class Bmw extends Car {

	public Bmw(String engineName, int power) {
		super(engineName, power);
	}

	@Override
	void start() {
	System.out.println("Bmw is started");
		
	}

	@Override
	void run() {
		System.out.println("Bmw is running");
		
	}

	@Override
	void stop() {
       System.out.println("Bmw is stopped");
		
	}

	void Details() {
		System.out.println("the car is Bmw");
		System.out.println("the engine is"+this.EngineName);
		System.out.println("the power of engine is "+this.Power);
		
	}

}
